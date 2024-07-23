package com.interview.practice.epam.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
problem statement
Write a program that takes a list of words, counts the frequency of each word,
and prints the word along with its count in descending order of frequency use java 8 only.
 */

public class CountCharacters {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "kiwi", "banana", "kiwi", "kiwi");

        words.stream()
                .flatMap(word -> word.chars().mapToObj(x -> (char) x))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(x -> {
                    System.out.println("'" + x.getKey() + " occours " + x.getValue());
                });
    }
}
