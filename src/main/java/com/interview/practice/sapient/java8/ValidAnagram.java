package com.interview.practice.sapient.java8;

public class ValidAnagram {

    public static boolean isValidAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] anagram = new int[26];

        for (int i = 0; i < t.length(); i++) {
            anagram[s.charAt(i) - 'a']++;
            anagram[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(anagram[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagramd";
        String t = "anamrag";
        System.out.println(isValidAnagram(s,t));
    }
}
