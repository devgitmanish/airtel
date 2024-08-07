package com.interview.practice.sapient.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapOnValues {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "zeebra");
        map.put(102, "cow");
        map.put(103, "lion");
        map.put(104, "monkey");

        LinkedHashMap<Integer, String> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (x, y) -> x, LinkedHashMap::new));

        sortedMap.entrySet().forEach(System.out::println);
    }
}
