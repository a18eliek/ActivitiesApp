package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class MountainDetailsActivity extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);

        //Ta emot allt som blev skickat ifrån MainActivity
        Intent intent = getIntent();
        String mountainName = intent.getStringExtra(MainActivity.MOUNTAIN_NAME);
        String mountainLocation = intent.getStringExtra(MainActivity.MOUNTAIN_LOCATION);
        String mountainHeight = intent.getStringExtra(MainActivity.MOUNTAIN_HEIGHT);
        String mountainID = intent.getStringExtra(MainActivity.MOUNTAIN_ID);

        //Ändra TextView för bergets namn
        TextView mountainNameTextView = (TextView) findViewById(R.id.MOUNTAIN_NAME);
        mountainNameTextView.setText(mountainName);
        setTitle(mountainName); //Ändra lable text till bergnamnet

        //Ändra TextView för bergets plats
        TextView mountainLocationTextView = (TextView) findViewById(R.id.MOUNTAIN_LOCATION);
        mountainLocationTextView.setText("Plats: " + mountainLocation);

        //Ändra TextView för bergets höjd
        TextView mountainHeightTextView = (TextView) findViewById(R.id.MOUNTAIN_HEIGHT);
        mountainHeightTextView.setText("Höjd: " + mountainHeight);


        //Bild på berget
        int[] mountainImgs = {R.mipmap.matterhorn, R.mipmap.mountblanc, R.mipmap.denali};

        //Bildernas licencer
        String[] mountainLicence = {"Licenced under Attribution-ShareAlike 2.5 Generic (CC BY-SA 2.5).",
        "Licenced under Attribution-ShareAlike 3.0 Unported (CC BY-SA 3.0)", "Licenced under Public Domain"};

        TextView mountainLicenceTextView = (TextView) findViewById(R.id.MOUNTAIN_LICENCE);
        mountainLicenceTextView.setText(mountainLicence[Integer.parseInt(mountainID)]);

        //Hitta samt byt ut bild till det berg användaren valt.
        image = findViewById(R.id.MountainImageView);
        image.setImageResource(mountainImgs[Integer.parseInt(mountainID)]);
        Log.d("brom", "Laddade bild " + Integer.parseInt(mountainID));

        Log.d("brom", "onCreate() in MountainDetailsActivity called.");

    }

}
