package com.interview.practice.java8interview.coforge;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryByMyntra {

    public static void nthHighestSalarySimpleWay(Map<String, Integer> map, int num){

        Map.Entry<String, Integer> stringIntegerEntry = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(num - 1);

        System.out.println(stringIntegerEntry);

    }

    public static void nthHighestSalaryComplexWay(Map<String, Integer> map, int num){

        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))

                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(num - 1);

        System.out.println(integerListEntry);
    }


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("manish", 500000);
        map.put("harish", 400000);
        map.put("ram", 300000);
        map.put("laxman", 200000);
        map.put("hanu", 200000);

        nthHighestSalarySimpleWay(map, 2);

        Map<String, Integer> complex = new HashMap<>();
        complex.put("manish", 500000);
        complex.put("golu", 400000);
        complex.put("harish", 400000);
        complex.put("ram", 300000);
        complex.put("laxman", 200000);
        complex.put("hanu", 200000);
        nthHighestSalaryComplexWay(complex, 2);
    }
}
