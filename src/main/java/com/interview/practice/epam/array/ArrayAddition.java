package com.interview.practice.epam.array;

import java.util.Arrays;

public class ArrayAddition {

    public static int [] addingArray(int [] arr1, int [] arr2){

        int [] result = new int[arr1.length+arr2.length];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = result.length-1;
        int sum = 0;
        int carry = 0;

        while(i>=0 || j>=0){
            sum = carry;
            if(i>=0){
                sum += arr1[i];
                i--;
            }
            if(j>=0){
                sum += arr2[j];
                j--;
            }
            result[k] = sum % 10;
            k--;
            carry = sum/10;
        }
        if(carry!=0){
            result[k] = carry;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {9, 8, 9};
        int arr2[] =    {9, 9};
        System.out.println("Addition Array "+ Arrays.toString(addingArray(arr1, arr2)));


    }
}
