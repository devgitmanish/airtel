package com.interview.practice.LeetCodeArray.interview;

import java.util.Arrays;

public class MovingZerosAtLast {

    public static void moveZeros(int[] nums) {

        if (nums.length == 1) return;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        for(int i=left; i<nums.length; i++){
            nums[i] = 0;
        }
        System.out.println("After Algo "+Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {1, 9, 0, 2, 8, 3, 0, 0, 6, 4, 0, 5, 7, 0};
        System.out.println("Before Algo "+Arrays.toString(nums));
        moveZeros(nums);
    }
}
