package com.bsamuel.exercises.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurencesTest {
    @Test
    public void countofCccurencesTest() {
        CountOccurences cO = new CountOccurences();
        long count = cO.countofCccurences("HelloWorld", 'l');
        assertEquals(3, count);
    }


}