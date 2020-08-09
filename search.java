package com.example.smartrecipe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class search extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Toolbar toolbar;

    SearchView searchView;
    ListView listView;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav1);
        navigationView.setNavigationItemSelectedListener(this);
        searchView = findViewById(R.id.s1);
        listView = findViewById(R.id.list1);

        list = new ArrayList<>();

        list.add("Tahari Biryani");
        list.add("sindhi biryani");
        list.add("bombai biryani ");
        list.add("Kacchi biryani ");
        list.add("Tahari biryani");
        list.add("yakhni palao ");
        list.add("Kabuli palao");
        list.add("Matar palao ");
        list.add("Bano beef palao ");
        list.add("Vegetable palao ");
        list.add("Mash ki dal");
        list.add("Mango juice");
        list.add("dal chawal");
        list.add("channe ki dal");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if ((list.get(position)).equals("Hydrabadi Biryani")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Sindhi biryani")) {
                    Intent intent = new Intent(search.this,Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("bombai biryani")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Kacchi biryani")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Tahari biryani")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Yakhni palao")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Kabuli biryani")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Matar Palao")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Banu Beef Palao")) {
                    Intent intent = new Intent(search.this,Itemdetails.class);
                    startActivity(intent);
                } else if ((list.get(position)).equals("Vegetable Palao")) {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(search.this, Itemdetails.class);
                    startActivity(intent);
                }
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        navigationView.bringToFront();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
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

