package com.interview.practice.sapient.java8;

import java.util.Arrays;

public class SortArray {

    public static void sortedArray(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];
            int j = i - 1;

            while (j >= 0 && current < nums[j]) {

                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int input[] = {7, 5, -110, 90, 23, 6};
        sortedArray(input);
    }
}
