package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};
    // Create ArrayLists from the raw data above and use these lists when populating your ListView.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("brom", "onStop() called.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("brom", "onStart() called.");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("brom", "onCreate() called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("brom", "onPause() called.");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("brom", "onPause() called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("brom", "onDestroy() called.");
    }
}
