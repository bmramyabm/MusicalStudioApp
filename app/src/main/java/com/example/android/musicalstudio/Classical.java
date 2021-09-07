package com.example.android.musicalstudio;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Classical extends AppCompatActivity implements ListView.OnItemClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        // Create a list of words
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Unnai Kaanadhu Naan", "Vishwaroopam", R.drawable.tamil6));
        albums.add(new Album("Varaaga Nathi", "Sangamam", R.drawable.tamil7));
        albums.add(new Album("Mayilrage", "Ah..ahh", R.drawable.tamil8));
        albums.add(new Album("Malare", "Karna", R.drawable.tamil9));
        albums.add(new Album("Kannamoochchi", "Isai", R.drawable.tamil6));
        albums.add(new Album("Aaruyire", "Guru", R.drawable.tamil10_1));
        albums.add(new Album("Enge En Punnagai", "Thalam", R.drawable.tamil7));
        albums.add(new Album("Athithom", "Chandramukhi", R.drawable.tamil8));
        albums.add(new Album("Pachai Nirame", "Alaipayuthey", R.drawable.tamil9));
        albums.add(new Album("Yenna Solla Pogirai", "Kavin", R.drawable.tamil10_1));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    /**
     * Method to identify ListView item clicked and launch PlayerActivity
     */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected opus.
        Album currentAlbum = (Album) adapterView.getItemAtPosition(position);
        // Extract strings from Opus object.
        String titleForPlaying = currentAlbum.getTitle();
        String artistForPlaying = currentAlbum.getArtist();
        int moviePlaying = currentAlbum.getImageResourceId();
        // Sending the name of composer and his opus to PlayerActivity.
        Intent songIntent = new Intent(this, PlayerActivity.class);
        songIntent.putExtra("Title", titleForPlaying);
        songIntent.putExtra("Artist", artistForPlaying);
        songIntent.putExtra("imageResourceId", moviePlaying);
        startActivity(songIntent);
    }
}

