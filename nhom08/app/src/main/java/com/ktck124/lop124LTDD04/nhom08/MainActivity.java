package com.ktck124.lop124LTDD04.nhom08;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu); // Đảm bảo layout này chứa BottomNavigationView
            frameLayout = findViewById(R.id.container);

            // Load fragment mặc định khi mở ứng dụng
            if (savedInstanceState == null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new InfoFragment()).commit();
            }

            // Gắn sự kiện cho BottomNavigationView
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
            bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int id = item.getItemId();
                    if (id == R.id.nav_featured) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
                    }
                    if (id == R.id.nav_feed) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new InfoFragment()).commit();
                    }

                    return true;
                }

            });
        }}
