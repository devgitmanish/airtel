package com.interview.practice.LeetCodeArray.Strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length ==0 ) return "";

        String prefix = strs[0];
        System.out.println(prefix);

        for(int index=1; index < strs.length; index++){

            while(strs[index].indexOf(prefix) != 0){

                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String [] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

    }
}

//["flower", "flow", "flight"]