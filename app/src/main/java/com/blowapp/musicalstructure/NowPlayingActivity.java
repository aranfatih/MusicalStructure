package com.blowapp.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        getSupportActionBar().setElevation(0);

        LinearLayout homeButton = (LinearLayout) findViewById(R.id.menu_bar_home);
        LinearLayout artistsButton = (LinearLayout) findViewById(R.id.menu_bar_artists);
        LinearLayout favoriteButton = (LinearLayout) findViewById(R.id.menu_bar_favorite);
        LinearLayout genreButton = (LinearLayout) findViewById(R.id.menu_bar_genre);
        LinearLayout searchButton = (LinearLayout) findViewById(R.id.menu_bar_search);

        homeButton.setOnClickListener(new HomeTabClickHandler());
        artistsButton.setOnClickListener(new ArtistTabClickHandler());
        favoriteButton.setOnClickListener(new FavoriteTabClickHandler());
        genreButton.setOnClickListener(new GenreTabClickHandler());
        searchButton.setOnClickListener(new SearchTabClickHandler());
    }
}
