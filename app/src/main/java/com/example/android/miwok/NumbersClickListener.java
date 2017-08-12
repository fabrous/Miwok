package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by btfab on 03/08/2017.
 */

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Open the list of Numbers!", Toast.LENGTH_SHORT).show();
    }
}
