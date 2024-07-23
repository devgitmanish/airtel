package com.interview.practice.LeetCodeArray.leetcode;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] nums) {

        int carry = 1;

        for (int index = nums.length - 1; index >= 0; index--) {

            int value = nums[index] + carry;

            if (value >= 10) {
                carry = 1;
                nums[index] = value % 10;
            }
            else{
                carry = 0;
                nums[index] = value;
            }
        }
        if(carry==1){
            int [] newNums = new int[nums.length+1];
            newNums[0] = 1;
            return newNums;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
