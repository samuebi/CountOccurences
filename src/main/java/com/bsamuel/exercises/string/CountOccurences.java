package com.bsamuel.exercises.string;

public class CountOccurences {

    public static long countofCccurences(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }

    public static void main(String[] args) {
        System.out.println("Count of 'f' is: " + countofCccurences("asdfljdsafljasdlfjsda", 'f'));
    }
}
