package com.interview.practice.sapient.coderpad.done;

public class ReverseString {

    public static String reverseString(String str){

        char [] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static String reverseStringUsingRecursion(String str) {
        // Base case: if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: reverse the rest of the string and append the first character
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
        System.out.println(reverseStringUsingRecursion("abcd"));

        /*

        abcd
        bcd+a
        cd+b+a
        d+c+b+a
         */
    }
}
