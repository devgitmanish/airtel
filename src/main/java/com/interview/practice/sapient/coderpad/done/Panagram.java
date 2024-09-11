package com.interview.practice.sapient.coderpad.done;

import java.util.HashSet;
import java.util.Set;

/**
 * Pangram Finder
 * <p>
 * The sentence "The quick brown fox jumps over the lazy dog" contains
 * every single letter in the alphabet. Such sentences are called pangrams.
 * Write a function findMissingLetters, which takes a String `sentence`,
 * and returns all the letters it is missing, appended in alphabetical order.
 */
public class Panagram {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public String findMissingLetters(String sentence) {
        Set<Character> missingLetters = new HashSet<>();
        // Add all letters of the alphabet to the set
        for (char c : ALPHABET.toCharArray()) {
            missingLetters.add(c);
        }

        // Convert the sentence to lowercase and iterate over each character
        for (char c : sentence.toLowerCase().toCharArray()) {
            // Remove the character from the set if it exists
            missingLetters.remove(c);
        }

        // Convert the set to a sorted string
        StringBuilder result = new StringBuilder();
        for (char c : ALPHABET.toCharArray()) {
            if (missingLetters.contains(c)) {
                result.append(c);
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }


    public static void main(String[] args) {

        Panagram pd = new Panagram();
        boolean flag = true;

        //flag = "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        //flag =  "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));
        flag =  "abcdefghijklmopqrstuvwxyz".equals(pd.findMissingLetters("k"));

        if (flag) {
            System.out.println("Pass ");
        } else {
            System.out.println("Failed");
        }
    }
    /*Point 1. Adding all the letters of the alphabet to the set takes (O(1))
     time because the size of the alphabet is constant (26 letters).

     */

    /* Converting the sentence to lowercase takes (O(n)) time, where (n)
    is the length of the sentence.
    Iterating over each character in the sentence
    and removing it from the set (if present) also takes (O(n)) time in total.
    Each remove operation on a HashSet takes (O(1)) time on average.

     */

    /* Summary


    Time Complexity: O(n)
    Space Complexity: O(n)

     */
}


