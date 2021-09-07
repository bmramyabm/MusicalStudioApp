package com.example.android.musicalstudio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Melody extends AppCompatActivity implements ListView.OnItemClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        // Create a list of words
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Elangathu", "Pithamagan", R.drawable.tamil7));
        albums.add(new Album("Sundari", "Thalapathi", R.drawable.tamil8));
        albums.add(new Album("Rakkamma", "Mithali", R.drawable.tamil9));
        albums.add(new Album("Valaiyosai KalaKala", "Karna", R.drawable.tamil6));
        albums.add(new Album("Ooru Sanam Thoogidichu", "Mella kathavu", R.drawable.tamil10_1));
        albums.add(new Album("En Vaanilay", "Jency", R.drawable.tamil7));
        albums.add(new Album("Germanien Senthan", "Thalam", R.drawable.tamil8));
        albums.add(new Album("Oru Kadhal Devadhai", "Jhonny", R.drawable.tamil6));
        albums.add(new Album("Asasiye Kaathule", "Swarangal", R.drawable.tamil9));
        albums.add(new Album("Enjoy Enjaami", "Arivu", R.drawable.tamil10_1));
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

