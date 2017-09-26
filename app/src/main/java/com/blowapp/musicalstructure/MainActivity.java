package com.blowapp.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);

        LinearLayout homeButton = (LinearLayout) findViewById(R.id.menu_bar_home);
        LinearLayout artistsButton = (LinearLayout) findViewById(R.id.menu_bar_artists);
        LinearLayout favoriteButton = (LinearLayout) findViewById(R.id.menu_bar_favorite);
        LinearLayout genreButton = (LinearLayout) findViewById(R.id.menu_bar_genre);
        LinearLayout searchButton = (LinearLayout) findViewById(R.id.menu_bar_search);

        LinearLayout song1 = (LinearLayout) findViewById(R.id.song1);
        LinearLayout song2 = (LinearLayout) findViewById(R.id.song2);
        LinearLayout song3 = (LinearLayout) findViewById(R.id.song3);
        LinearLayout song4 = (LinearLayout) findViewById(R.id.song4);
        LinearLayout song5 = (LinearLayout) findViewById(R.id.song5);

        ImageView playSong1 = (ImageView) findViewById(R.id.play_song1);
        ImageView playSong2 = (ImageView) findViewById(R.id.play_song2);
        ImageView playSong3 = (ImageView) findViewById(R.id.play_song3);
        ImageView playSong4 = (ImageView) findViewById(R.id.play_song4);
        ImageView playSong5 = (ImageView) findViewById(R.id.play_song5);

        homeButton.setOnClickListener(new HomeTabClickHandler());
        artistsButton.setOnClickListener(new ArtistTabClickHandler());
        favoriteButton.setOnClickListener(new FavoriteTabClickHandler());
        genreButton.setOnClickListener(new GenreTabClickHandler());
        searchButton.setOnClickListener(new SearchTabClickHandler());

        song1.setOnClickListener(new ArtistProfileClickHandler());
        song2.setOnClickListener(new ArtistProfileClickHandler());
        song3.setOnClickListener(new ArtistProfileClickHandler());
        song4.setOnClickListener(new ArtistProfileClickHandler());
        song5.setOnClickListener(new ArtistProfileClickHandler());

        playSong1.setOnClickListener(new PlayClickHandler());
        playSong2.setOnClickListener(new PlayClickHandler());
        playSong3.setOnClickListener(new PlayClickHandler());
        playSong4.setOnClickListener(new PlayClickHandler());
        playSong5.setOnClickListener(new PlayClickHandler());

    }

}
