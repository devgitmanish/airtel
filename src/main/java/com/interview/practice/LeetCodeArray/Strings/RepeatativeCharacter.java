package com.interview.practice.LeetCodeArray.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatativeCharacter {


    public static Map<Character, Integer> repeatCharacterCount(String str) {

        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, (map.get(ch)) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public static String repeatCharacterCount2(String str) {

        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, (map.get(ch)) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return removeRepeatCharacter(str, map);
    }

    public static String removeRepeatCharacter(String str, Map<Character, Integer> map){

        StringBuilder builder = new StringBuilder();
        for(char res : str.toCharArray()){
            if(map.get(res)==1){
                builder.append(res);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String str = "apple";
        Map<Character, Integer> characterStringMap = repeatCharacterCount(str);
        System.out.println("=====Character-Count====");
        characterStringMap.entrySet().stream()
                .forEach(x -> System.out.println("Character " + x.getKey()
                        + " Count " + x.getValue()));
        StringBuffer st = new StringBuffer();
        str.chars().distinct().forEach(x -> st.append((char)x));
        System.out.println("remove duplicate only once  "+ st);

        System.out.println("=====Character-Count 2222 ====");






    }
}
