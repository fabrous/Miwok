package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("father", "epe"));
        family.add(new Word("mother", "eta"));
        family.add(new Word("son", "angsi"));
        family.add(new Word("daugther", "tune"));
        family.add(new Word("older brother", "taachi"));
        family.add(new Word("younger brother", "chalitti"));
        family.add(new Word("older sister", "tete"));
        family.add(new Word("younger sister", "kolliti"));
        family.add(new Word("grandmother", "ama"));
        family.add(new Word("grandfather", "paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this, family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
