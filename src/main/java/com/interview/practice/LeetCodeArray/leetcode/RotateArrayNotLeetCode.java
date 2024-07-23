package com.interview.practice.LeetCodeArray.leetcode;

import java.util.Arrays;

public class RotateArrayNotLeetCode {

    public static int[] reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Reverse Array :" +
                Arrays.toString(reverseArray(nums, 0, nums.length - 1)));

    }
}
