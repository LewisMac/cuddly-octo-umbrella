package com.example.user.lettercounter;

import java.util.ArrayList;


/**
 * Created by user on 13/12/2016.
 */
public class WordCount {
    private ArrayList<String> words;
    String sentence;

    public WordCount(String sentence){
        words = new ArrayList<String>();
        this.sentence = sentence;
    }

    public int countingWordsInASentence(){
        for (String word: sentence.split(" ")){
            words.add(word);
        }
        return words.size();
    }
}
