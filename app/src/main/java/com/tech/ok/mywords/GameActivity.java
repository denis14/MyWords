package com.tech.ok.mywords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static com.tech.ok.mywords.R.id.buttonOne;
import static com.tech.ok.mywords.R.id.buttonTwo;
import static com.tech.ok.mywords.R.id.playButton;

public class GameActivity extends AppCompatActivity {

    private StringBuffer characters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        String exampleWord = "exampleword";
        final TextView word = (TextView) findViewById(R.id.word);
        word.setText(exampleWord);

        char[] wordElements = exampleWord.toCharArray();

        addCharacterToWord(R.id.buttonOne, String.valueOf(wordElements[0]));
        addCharacterToWord(R.id.buttonTwo, String.valueOf(wordElements[1]));
        addCharacterToWord(R.id.buttonThree, String.valueOf(wordElements[2]));
        addCharacterToWord(R.id.buttonFour, String.valueOf(wordElements[3]));
        addCharacterToWord(R.id.buttonFive, String.valueOf(wordElements[4]));
        addCharacterToWord(R.id.buttonSix, String.valueOf(wordElements[5]));
        addCharacterToWord(R.id.buttonSeven, String.valueOf(wordElements[6]));
        addCharacterToWord(R.id.buttonEight, String.valueOf(wordElements[7]));
        addCharacterToWord(R.id.buttonNine, String.valueOf(wordElements[8]));
        addCharacterToWord(R.id.buttonTen, String.valueOf(wordElements[9]));
        addCharacterToWord(R.id.buttonEleven, String.valueOf(wordElements[10]));
        addCharacterToWord(R.id.buttonTwelve, String.valueOf(wordElements[0]));
        addCharacterToWord(R.id.buttonThirteen, String.valueOf(wordElements[0]));
        addCharacterToWord(R.id.buttonFourteen, String.valueOf(wordElements[0]));
        addCharacterToWord(R.id.buttonFifteen, String.valueOf(wordElements[0]));
        final Button buttonDelete = (Button) findViewById(R.id.buttonDelete);


        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView = (TextView) findViewById(R.id.translationWord);
                String text = textView.getText().toString();
                if(text.length() > 0) {
                    textView.setText(text.substring(0, text.length() - 1));
                }
            }
        });
    }

    private void addCharacterToWord(int id, String letter) {
        final Button button = (Button) findViewById(id);
        button.setText(letter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView textView = (TextView) findViewById(R.id.translationWord);
                String text = textView.getText().toString();
                text += button.getText().toString();
                textView.setText(text);
            }
        });
    }

}
