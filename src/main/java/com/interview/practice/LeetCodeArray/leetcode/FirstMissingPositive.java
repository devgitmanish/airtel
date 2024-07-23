package com.interview.practice.LeetCodeArray.leetcode;

/* Given an unsorted integer array nums return the smallest missing positive integer*/
public class FirstMissingPositive {


    public int firstMisssingPositive(int[] nums) {

        /* preprosess the array */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }
        /* Marking Index */
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (index < nums.length && nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }
        /* scan the array */

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                return i + 1;
        }
        return nums.length + 1;
    }
}
