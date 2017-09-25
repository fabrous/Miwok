package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        phrases.add(new Word("What is your name?", "tinne oyaase'ne", R.raw.phrase_what_is_your_name));
        phrases.add(new Word("My name is ...", "oyaaset ...", R.raw.phrase_my_name_is));
        phrases.add(new Word("How are you felling?", "michekses?", R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("I'm felling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Are you coming?", "eenes'aa?", R.raw.phrase_are_you_coming));
        phrases.add(new Word("Yes, I'm coming.", "hee'eenem", R.raw.phrase_yes_im_coming));
        phrases.add(new Word("I'm coming.", "eenem", R.raw.phrase_im_coming));
        phrases.add(new Word("Let's go.", "yoowutis", R.raw.phrase_lets_go));
        phrases.add(new Word("Come here.", "enni'nem", R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this, phrases, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word atualWord = phrases.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, atualWord.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }

}
