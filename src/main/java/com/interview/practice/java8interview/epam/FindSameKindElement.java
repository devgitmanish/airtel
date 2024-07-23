package com.interview.practice.java8interview.epam;

import java.lang.reflect.Array;
import java.util.*;

public class FindSameKindElement {

    public static void findSameKindElementWay1(String [] arr) {
        Map<String, List<String>> groupedStrings = new HashMap<>();

        for (String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            groupedStrings.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        for (Map.Entry<String, List<String>> entry : groupedStrings.entrySet()) {
            List<String> strings = entry.getValue();
            if (strings.size() > 1) {
                System.out.println(strings + " containssamecharacter");
            }
        }
    }






    public static void findsamePair(String [] arr){

        Map<String, List<String>> map = new HashMap<>();
        for(String str : arr){

            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            map.computeIfAbsent(sorted, x -> new ArrayList<>()).add(str);
        }
        map.entrySet()
                .stream()
                .filter(x -> x.getValue().size() > 1)
                .forEach(x -> System.out.println(x.getValue()));
    }
    public static void main(String[] args) {

        String arr[] = {"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
        findsamePair(arr);

    }
}
