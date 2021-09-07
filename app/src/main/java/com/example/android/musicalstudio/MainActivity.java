package com.example.android.musicalstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView classicaltext = (TextView) findViewById(R.id.classical);
        TextView melodytext = (TextView) findViewById((R.id.melody));
        TextView hiphoptext = (TextView) findViewById(R.id.hiphop);
        TextView dancetext = (TextView) findViewById(R.id.dance);

        ImageButton classical = (ImageButton) findViewById(R.id.btn1);
        ImageButton melody = (ImageButton) findViewById(R.id.btn2);
        ImageButton hiphop = (ImageButton) findViewById(R.id.btn3);
        ImageButton dance = (ImageButton) findViewById(R.id.btn4);

        classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent classicalIntent = new Intent(MainActivity.this, Classical.class);
                // Start the new activity
                startActivity(classicalIntent);

            }
        });
        // Set a click listener on that View
        classicaltext.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent classicalIntentText = new Intent(MainActivity.this, Classical.class);
                // Start the new activity
                startActivity(classicalIntentText);
            }
        });

        melody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent melodyIntent = new Intent(MainActivity.this, Melody.class);
                // Start the new activity
                startActivity(melodyIntent);
            }
        });
        melodytext.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent melodyIntentText = new Intent(MainActivity.this, Melody.class);
                // Start the new activity
                startActivity(melodyIntentText);
            }
        });

        hiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hiphopIntent = new Intent(MainActivity.this, HipHop.class);
                // Start the new activity
                startActivity(hiphopIntent);
            }
        });
        hiphoptext.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hiphopIntentText = new Intent(MainActivity.this, HipHop.class);
                // Start the new activity
                startActivity(hiphopIntentText);
            }
        });

        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent danceIntent = new Intent(MainActivity.this, Dance.class);
                // Start the new activity
                startActivity(danceIntent);
            }
        });
        dancetext.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent danceIntentText = new Intent(MainActivity.this, Dance.class);
                // Start the new activity
                startActivity(danceIntentText);
            }
        });
    }
}