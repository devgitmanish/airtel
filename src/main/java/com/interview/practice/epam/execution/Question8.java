package com.interview.practice.epam.execution;

import java.util.Arrays;

/*
Please use the below two arrays as inputs and try
to write a program addition of the two arrays
 */
public class Question8 {

    public static int [] twoArraySum(int [] arr1, int [] arr2){

        if(arr1.length!=arr2.length){
            throw new IllegalArgumentException("invalid lenght");
        }
        int [] result = new int[arr1.length];
        for(int i =0; i<arr1.length; i++){
            result[i]= arr1[i]+arr2[i];
        }
        return result;
    }
    public static int [] twoArraySumV2(int [] arr1, int [] arr2){

        if(arr1.length!=arr2.length){
            throw new IllegalArgumentException("invalid lenght");
        }
        int [] result = new int[arr1.length];
        for(int i =0; i<arr1.length; i++){
            result[i]= arr1[i]+arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 3, 5, 7, 9};
        int [] arr2 = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(twoArraySum(arr1, arr2)));
    }
}
