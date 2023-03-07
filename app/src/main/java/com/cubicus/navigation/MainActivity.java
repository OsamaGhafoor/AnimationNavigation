package com.cubicus.navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.rupins.drawercardbehaviour.CardDrawerLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    CardDrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (CardDrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer

        );

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout.setViewScale(Gravity.START,0.9f);
        drawerLayout.setRadius(Gravity.START,30);
        drawerLayout.setViewElevation(Gravity.START,20);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        int id = item.getItemId();

        if(id==R.id.item1){

            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item2){

            Toast.makeText(this, "Camera Clicked", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item3){

            Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item4){

            Toast.makeText(this, "Privacy Clicked", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}