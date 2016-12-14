package com.example.user.lettercounter;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 13/12/2016.
 */
public class WordCountTest {

    WordCount sentence;

    @Before
    public void Before() {
        sentence = new WordCount("Hi my name is Jeff");
    }

    @Test
    public void testCountingWordsInSentence(){
        assertEquals(5, sentence.countingWordsInASentence());
    }


}
