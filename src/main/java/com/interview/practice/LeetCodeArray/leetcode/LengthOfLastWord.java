package com.interview.practice.LeetCodeArray.leetcode;

public class LengthOfLastWord {

    public static int LastWordLenght(String str){
        int right = str.length()-1;

        while(right>=0 && str.charAt(right) == ' '){
            right --;
        }

        int left = right;

        while(left >=0 && str.charAt(left) != ' '){
            left--;
        }
        return right-left;
    }

    public static void main(String[] args) {

        String str = " ";

        System.out.println("Length of last word in string is : "+LastWordLenght(str));
    }
}
