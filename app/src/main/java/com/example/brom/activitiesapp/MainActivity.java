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

    // Create ArrayLists from the raw data above and use these lists when populating your ListView.
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};

    public static final String MOUNTAIN_NAME = "MOUNTAIN_NAME", MOUNTAIN_LOCATION = "MOUNTAIN_LOCATION", MOUNTAIN_HEIGHT = "MOUNTAIN_HEIGHT", MOUNTAIN_ID = "MOUNTAIN_ID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("brom", "onCreate() called.");


        //Skapar ett List objekt med alla berg. Se array mountainNames.
        List<String> listData = new ArrayList<String>(Arrays.asList(mountainNames));

        //Skapar en ArrayAdapter som ansluter till list_item_textview, my_item_textview samt med List objektet.
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.list_item_textview, R.id.my_item_textview, listData);

        //Hittar layout elementet my_listview och skapar en objekt instans.
        ListView myListView = (ListView)findViewById(R.id.my_listview);

        //Ansluter ArrayAdaptern med ListView objektet.
        myListView.setAdapter(adapter);

        //Skicka all information vid klick till vår intent
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(view.getContext(), MountainDetailsActivity.class);
                myIntent.putExtra(MOUNTAIN_NAME, mountainNames[position]);
                myIntent.putExtra(MOUNTAIN_LOCATION, mountainLocations[position]);
                myIntent.putExtra(MOUNTAIN_HEIGHT, Integer.toString(mountainHeights[position]));
                myIntent.putExtra(MOUNTAIN_ID, Integer.toString(position));

                startActivity(myIntent);
            }
        });

    }

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
