package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one", "lutti", R.drawable.number_one));
        numbers.add(new Word("two", "otiiko", R.drawable.number_two));
        numbers.add(new Word("three", "tolookosu", R.drawable.number_three));
        numbers.add(new Word("four", "oyyisa", R.drawable.number_four));
        numbers.add(new Word("five", "massokka", R.drawable.number_five));
        numbers.add(new Word("six", "temmokka", R.drawable.number_six));
        numbers.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        numbers.add(new Word("eight", "kawinta", R.drawable.number_eight));
        numbers.add(new Word("nine", "wo'e", R.drawable.number_nine));
        numbers.add(new Word("tem", "na'aacha", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


/*
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        for (int i=0; i < words.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }
*/

/*
        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));
*/
    }
}
