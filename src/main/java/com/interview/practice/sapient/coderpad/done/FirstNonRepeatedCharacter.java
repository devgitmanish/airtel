package com.interview.practice.sapient.coderpad.done;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static char findFirst(String input) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        char [] ch = input.toCharArray();
        for(char c : ch){
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }

        return map.entrySet().stream()
                .filter(x -> x.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0');
    }

    public static void findOccurance(String input){
        Map<Character, Integer> map = new LinkedHashMap<>();
        char [] ch = input.toCharArray();

        for(char c : ch){
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        //System.out.println(map);
        map.forEach((key, value) -> {
            System.out.println("Character "+key + " Occourance "+value);
        });
    }

    public static void findOccuranceViaStream(String str){

        Map<Character, Long> collect = str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        collect.forEach((key, value) -> {
            System.out.println("Character "+key + " Value "+ value);
        });
    }

    public static void main(String args[]) {

        String[] inputs = {"apple","racecars", "ababdc"};
        char[] outputs = {'a', 'e', 'd' };
        boolean result = true;

        for(int i = 0; i < inputs.length; i++ ) {
            result = result && findFirst(inputs[i]) == outputs[i];
            if(!result)
                System.out.println("Test failed for: " + inputs[i]);
            else
                System.out.println("Test passed for: " + inputs[i]);
        }
        findOccurance("apple");
        findOccuranceViaStream("apple");
    }
}
