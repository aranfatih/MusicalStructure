package com.blowapp.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class artist_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_profile);
        getSupportActionBar().setElevation(0);

        LinearLayout homeButton = (LinearLayout) findViewById(R.id.menu_bar_home);
        final LinearLayout artistsButton = (LinearLayout) findViewById(R.id.menu_bar_artists);
        LinearLayout favoriteButton = (LinearLayout) findViewById(R.id.menu_bar_favorite);
        LinearLayout genreButton = (LinearLayout) findViewById(R.id.menu_bar_genre);
        LinearLayout searchButton = (LinearLayout) findViewById(R.id.menu_bar_search);

        ImageView playSong1 = (ImageView) findViewById(R.id.play_song1);
        ImageView playSong2 = (ImageView) findViewById(R.id.play_song2);

        ImageView payment = (ImageView) findViewById(R.id.payment);
        ImageView payment2 = (ImageView) findViewById(R.id.payment2);

        homeButton.setOnClickListener(new HomeTabClickHandler());
        artistsButton.setOnClickListener(new ArtistTabClickHandler());
        favoriteButton.setOnClickListener(new FavoriteTabClickHandler());
        genreButton.setOnClickListener(new GenreTabClickHandler());
        searchButton.setOnClickListener(new SearchTabClickHandler());

        playSong1.setOnClickListener(new PlayClickHandler());
        playSong2.setOnClickListener(new PlayClickHandler());

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(artist_profile.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

        payment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(artist_profile.this, PaymentActivity.class);
                startActivity(intent);
            }
        });

    }


}
