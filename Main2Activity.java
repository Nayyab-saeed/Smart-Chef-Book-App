package com.example.smartrecipe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Toolbar toolbar;

    CardView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16;
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9, ib10, ib11, ib12, ib13, ib14, ib15, ib16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav1);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.open, R.string.close);

        navigationView.bringToFront();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();


        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);
        c3 = (CardView) findViewById(R.id.c3);
        c4 = (CardView) findViewById(R.id.c4);
        c5 = (CardView) findViewById(R.id.c5);
        c6 = (CardView) findViewById(R.id.c6);
        c7 = (CardView) findViewById(R.id.c7);
        c8 = (CardView) findViewById(R.id.c8);
        c9 = (CardView) findViewById(R.id.c9);
        c10 = (CardView) findViewById(R.id.c10);
        c11 = (CardView) findViewById(R.id.c11);
        c12 = (CardView) findViewById(R.id.c12);
        c13 = (CardView) findViewById(R.id.c13);
        c14 = (CardView) findViewById(R.id.c14);
        c15 = (CardView) findViewById(R.id.c15);
        c16 = (CardView) findViewById(R.id.c16);

        ib1 = (ImageButton) findViewById(R.id.ib1);
        ib2 = (ImageButton) findViewById(R.id.ib2);
        ib3 = (ImageButton) findViewById(R.id.ib3);
        ib4 = (ImageButton) findViewById(R.id.ib4);
        ib5 = (ImageButton) findViewById(R.id.ib5);
        ib6 = (ImageButton) findViewById(R.id.ib6);
        ib7 = (ImageButton) findViewById(R.id.ib7);
        ib8 = (ImageButton) findViewById(R.id.ib8);
        ib9 = (ImageButton) findViewById(R.id.ib9);
        ib10 = (ImageButton) findViewById(R.id.ib10);
        ib11 = (ImageButton) findViewById(R.id.ib11);
        ib12 = (ImageButton) findViewById(R.id.ib12);
        ib13 = (ImageButton) findViewById(R.id.ib13);
        ib14 = (ImageButton) findViewById(R.id.ib14);
        ib15 = (ImageButton) findViewById(R.id.ib15);
        ib16 = (ImageButton) findViewById(R.id.ib16);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
        ib16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                open_activity();
            }
        });
    }

    public void open_activity()
    {
        Intent intent1=new Intent(this,ItemList.class);
        startActivity(intent1);
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
