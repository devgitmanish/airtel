package com.interview.practice.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetativeCharacter {


    public static void firstRepetativeChar(String str) {

        LinkedHashMap<Character, Long> countValues = str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        System.out.println(countValues);

        Optional<Character> firstNonRepetitive = countValues.entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (firstNonRepetitive.isPresent())
            System.out.println(firstNonRepetitive.get());
    }

    public static void main(String[] args) {

        String str = "apple";
        firstRepetativeChar(str);

    }
}
