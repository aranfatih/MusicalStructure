package com.blowapp.musicalstructure;

import android.content.Intent;
import android.view.View;

/**
 * Created by Aran on 9/21/2017.
 */

public class ArtistTabClickHandler implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent openArtistTabIntent = new Intent();
        openArtistTabIntent.setClass(view.getContext(), ArtistTabActivity.class);
        view.getContext().startActivity(openArtistTabIntent);
    }
}
