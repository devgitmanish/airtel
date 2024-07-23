package com.interview.practice.LeetCodeArray.Strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedDNASequence {

    private static List<String> repeatedDNASequence(String str) {

        Map<String, Integer> map = new HashMap<>();

        for (int index = 0; index <= str.length() - 10; index++) {

            String subString = str.substring(index, index + 10);

            map.put(subString, map.getOrDefault(subString, 0) + 1);
        }

        return map.entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());


    }

    public static void main(String[] args) {

        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(repeatedDNASequence(str));
    }
}
