package com.interview.practice.string;

import java.util.Arrays;

public class ReverseArray {

    public static char[] reverse(char [] arr){

        int start = 0;
        int end = arr.length-1;

        //code
        while (start<=end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args) {
        char [] arr = {'h','e','l','l','o','k'};
        System.out.print(reverse(arr));

    }
}
