package com.example.amazfitaddon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.amazfitaddon.location.LocationActivity;

public class MainActivity extends AppCompatActivity {
    private Intent locationActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationActivity = new Intent(this, LocationActivity.class);
    }

    public void getLocationActivity(View view) {
        startActivity(locationActivity);
    }
}
