package com.example.appkhanhv2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.menu_featured) {
                // Hiện tại đang ở trang Featured, không cần chuyển
                return true;
            } else if (itemId == R.id.menu_feed) {
                // Chuyển đến trang Feed
                Intent intentFeed = new Intent(SecondActivity.this, FeedActivity.class);
                startActivity(intentFeed);
                return true;
            } else if (itemId == R.id.menu_settings) {
                // Chuyển đến trang Settings
                Intent intentSettings = new Intent(SecondActivity.this, SettingsActivity.class);
                startActivity(intentSettings);
                return true;
            }

            return false;
        });


    }
}