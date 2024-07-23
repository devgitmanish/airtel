package com.interview.practice.sortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class InserationSort {

    /*
    time complaxity 0(n^2)
     */
    public static void inserationSort(int[] nums) {

        for(int i=0; i<nums.length; i++){

            int current = nums[i];
            int j = i-1;
            while(j>=0 && current < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 1, 5, 6, 2};
        inserationSort(arr);

    }
}

