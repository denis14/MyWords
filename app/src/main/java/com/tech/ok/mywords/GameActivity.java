package com.tech.ok.mywords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.tech.ok.mywords.R.id.buttonOne;
import static com.tech.ok.mywords.R.id.buttonTwo;
import static com.tech.ok.mywords.R.id.playButton;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        addCharacterToWord(R.id.buttonOne);
        addCharacterToWord(R.id.buttonTwo);
        addCharacterToWord(R.id.buttonThree);
        addCharacterToWord(R.id.buttonFour);
        addCharacterToWord(R.id.buttonFive);
        addCharacterToWord(R.id.buttonSix);
        addCharacterToWord(R.id.buttonSeven);
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

    private void addCharacterToWord(int id) {
        final Button button = (Button) findViewById(id);
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
