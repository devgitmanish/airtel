package com.interview.practice.sapient.coderpad.done;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    /* Time Complixity  O(NK) where n is length of str and k is max length of str*/
    public static List<List<String>> groupAnagram(String [] str){

        Map<String, List<String>> map = new HashMap<>();

        for(String st : str){
            int [] count = new int[26];
            for(char c : st.toCharArray()){
                count[c -'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(st);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String [] arr = {"aab", "baa"};
        System.out.println(groupAnagram(arr));
    }

}
