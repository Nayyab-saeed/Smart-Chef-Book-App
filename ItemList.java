package com.example.smartrecipe;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class ItemList extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Intent intent;
    ListView l1;
    ArrayList<String> list=new ArrayList<>();
    DatabaseHelper helper;
    SQLiteDatabase db;
    Cursor c;
    String s1,s2,s3,s4;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        helper = new DatabaseHelper(this);
        db = helper.getReadableDatabase();
        Intent intent = getIntent();
        String value = intent.getStringExtra("value");
        String sortOrder = DatabaseContract.details.COL_NAME + " ASC";
        c = db.query(DatabaseContract.details.TABLE_NAME, null, null, null, null, null, sortOrder);
        while (c.moveToNext())
        {
            if(c.getString(1).startsWith(value)) {
                String name1 = c.getString(1);
                list.add(name1);
            }
        }

        Adapter adapter = new Adapter<String>(this, android.R.layout.simple_list_item_1, list);
        l1 = findViewById(R.id.list1);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent1 = new Intent(ItemList.this, Itemdetails.class);
                String str = list.get(position);
                c.requery();
                while (c.moveToNext()) {
                    String a=c.getString(1);
                    if (a.equalsIgnoreCase(str)) {
                        s1 = c.getString(1);
                        s2 = c.getString(3);
                        s3 = c.getString(4);
                        s4 = c.getString(6);
                    }
                }
                db.close();
                intent1.putExtra("name", s1);
                intent1.putExtra("ingredients", s2);
                intent1.putExtra("methods", s3);
                intent1.putExtra("time", s4);
                startActivity(intent1);
            }
        });

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav1);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        navigationView.bringToFront();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();


    }

    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent6 = new Intent(this, Main2Activity.class);
                startActivity(intent6);
                break;
            case R.id.search:
                Intent intent2 = new Intent(this, search.class);
                startActivity(intent2);
                break;
            case R.id.follow:
                Intent intent3 = new Intent(this, Follow.class);
                startActivity(intent3);
                break;
            case R.id.Contact:
                Intent intent4 = new Intent(Intent.ACTION_DIAL);
                intent4.setData(Uri.parse("tel:03115324945"));
                startActivity(intent4);
                break;
            case R.id.about:
                Intent intent5 = new Intent(this, About.class);
                startActivity(intent5);
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
