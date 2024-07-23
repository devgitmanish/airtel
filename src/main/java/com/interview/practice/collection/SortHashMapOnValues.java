package com.interview.practice.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortHashMapOnValues {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1001, "ram");
        map.put(1005, "laxman");
        map.put(1004, "alex");
        map.put(1002, "ramesh");
        map.put(1003, "yadav");


        LinkedHashMap<Integer, String> sortedByValues = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (x, y) -> x, LinkedHashMap::new));

        System.out.println("Sorted by Values "+sortedByValues);


        LinkedHashMap<Integer, String> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
                        , (x, y) -> x, LinkedHashMap::new));

        System.out.println("Sorted by Key "+collect);

    }
}
