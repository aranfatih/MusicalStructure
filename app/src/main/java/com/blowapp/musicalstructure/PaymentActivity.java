package com.blowapp.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
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

//        Button buyButton = (Button) findViewById(R.id.buy_song);

//        buyButton.setOnClickListener(new View.OnClickListener(){
//
//        });
    }
}
