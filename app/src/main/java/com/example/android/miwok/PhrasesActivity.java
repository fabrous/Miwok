package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word("Where are you going?", "minto wuksus"));
        phrases.add(new Word("What is your name?", "tinne oyaase'ne"));
        phrases.add(new Word("My name is ...", "oyaaset ..."));
        phrases.add(new Word("How are you felling?", "michekses?"));
        phrases.add(new Word("I'm felling good.", "kuchi achit"));
        phrases.add(new Word("Are you coming?", "eenes'aa?"));
        phrases.add(new Word("Yes, I'm coming.", "hee'eenem"));
        phrases.add(new Word("I'm coming.", "eenem"));
        phrases.add(new Word("Let's go.", "yoowutis"));
        phrases.add(new Word("Come here.", "enni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

}
