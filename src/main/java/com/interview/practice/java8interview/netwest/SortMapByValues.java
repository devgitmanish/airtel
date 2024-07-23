package com.interview.practice.java8interview.netwest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapByValues {

    public static void sortMapByValues(Map<Integer, String> map){

        LinkedHashMap<Integer, String> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (x, y) -> x,
                        LinkedHashMap::new));

        collect.entrySet()
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "manish");
        map.put(5, "ram");
        map.put(3, "laxman");
        map.put(2, "alex");
        map.put(4, "hanu");
        sortMapByValues(map);
    }
}
