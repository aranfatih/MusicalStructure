package com.blowapp.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ArtistTabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_tab);
        getSupportActionBar().setElevation(0);

        LinearLayout homeButton = (LinearLayout) findViewById(R.id.menu_bar_home);
        LinearLayout artistsButton = (LinearLayout) findViewById(R.id.menu_bar_artists);
        LinearLayout favoriteButton = (LinearLayout) findViewById(R.id.menu_bar_favorite);
        LinearLayout genreButton = (LinearLayout) findViewById(R.id.menu_bar_genre);
        LinearLayout searchButton = (LinearLayout) findViewById(R.id.menu_bar_search);

        LinearLayout song1 = (LinearLayout) findViewById(R.id.song1);
        LinearLayout song2 = (LinearLayout) findViewById(R.id.song2);
        TextView jamesBluntProfile = (TextView) findViewById(R.id.new_hits_textview);

        ImageView playSong1 = (ImageView) findViewById(R.id.play_song1);
        ImageView playSong2 = (ImageView) findViewById(R.id.play_song2);

        homeButton.setOnClickListener(new HomeTabClickHandler());
        artistsButton.setOnClickListener(new ArtistTabClickHandler());
        favoriteButton.setOnClickListener(new FavoriteTabClickHandler());
        genreButton.setOnClickListener(new GenreTabClickHandler());
        searchButton.setOnClickListener(new SearchTabClickHandler());

        song1.setOnClickListener(new ArtistProfileClickHandler());
        song2.setOnClickListener(new ArtistProfileClickHandler());
        jamesBluntProfile.setOnClickListener(new ArtistProfileClickHandler());

        playSong1.setOnClickListener(new PlayClickHandler());
        playSong2.setOnClickListener(new PlayClickHandler());

    }
}
