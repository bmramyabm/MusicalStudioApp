package com.example.android.musicalstudio;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        Intent currentSong = getIntent();

        TextView opusTextView = findViewById(R.id.titleName);
        String titleForPlaying = currentSong.getStringExtra("Title");
        opusTextView.setText(titleForPlaying);

        TextView composerTextView = findViewById(R.id.artistName);
        String artistForPlaying = currentSong.getStringExtra("Artist");
        composerTextView.setText(artistForPlaying);

    }


}
