package com.interview.practice.LeetCodeArray.tough;

import java.util.Arrays;

public class RotateArray {

    public static void rotateArray(int [] nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int [] nums ={6, 5, 4, 3, 2, 1};
        rotateArray(nums, 0, nums.length-1);
    }
}
