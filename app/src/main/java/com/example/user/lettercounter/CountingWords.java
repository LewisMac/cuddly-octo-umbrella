package com.example.user.lettercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class CountingWords extends AppCompatActivity {

    EditText questionEditText;
    Button submitButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText) findViewById(R.id.sentence_text);
        submitButton = (Button) findViewById(R.id.count_button);
        answerText = (TextView)findViewById(R.id.answer_text);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LetterCount", "Button clicked");
                String sentence = questionEditText.getText().toString();
                Log.d("LetterCount", "value returned");
                WordCount wordcount = new WordCount(sentence);
                int numberOfWords = wordcount.countingWordsInASentence();
                String batman = Integer.toString(numberOfWords);
                answerText.setText(batman);
            }
        });
    }
}
