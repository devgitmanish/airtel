package com.interview.practice.LeetCodeArray.tough;

import java.util.Arrays;

public class SortArray {

    public static void sortedArray(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            int right = nums[i];
            int left = i - 1;

            while (left <= 0 && nums[right] > nums[left]) {

                nums[right] = nums[left];
                left = left - 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int input[] = {7, 5, -110, 90, 23, 6};
        sortedArray(input);
    }
}
