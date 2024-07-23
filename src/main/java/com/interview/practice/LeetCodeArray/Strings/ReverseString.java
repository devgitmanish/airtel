package com.interview.practice.LeetCodeArray.Strings;

/* Write a function that reverse a string. The input string is given as an array
of characters.
 */
public class ReverseString {

    public static char [] reverseString(char [] str) {

        int left =0;
        int right = str.length-1;

        while(left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return str;
    }

    public static void main(String[] args) {

        char [] str = {'h', 'e', 'l', 'l', '0'};
        System.out.print(reverseString(str));

    }
}
