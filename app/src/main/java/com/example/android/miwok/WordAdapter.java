package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by czw8 on 01/09/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColor;

    private void setBackgroundColor(int bgColor) {
        mBackgroundColor = bgColor;
    }

    private int getBackgroundColor() {
        return mBackgroundColor;
    }

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> wordArrayList, int backgroundColor) {
        super(context, 0, wordArrayList);
        setBackgroundColor(backgroundColor);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranlation());

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear_layout_view);
        int color = ContextCompat.getColor(getContext(), getBackgroundColor());
        linearLayout.setBackgroundColor(color);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }
        else
            image.setVisibility(View.GONE);

        return listItemView;
    }
}
