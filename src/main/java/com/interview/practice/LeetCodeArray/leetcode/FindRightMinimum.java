package com.interview.practice.LeetCodeArray.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class FindRightMinimum {

    public static void findRightMinimum(int[] nums) {

        int[] bucket = new int[102];

        for (int num : nums) {
            bucket[num]++;
        }
        for (int i = 1; i < bucket.length; i++) {

            bucket[i] = bucket[i] + bucket[i - 1];
        }
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {

            if(nums[i] == 0){
                result[i] = 0;
            }else{
                result[i] = bucket[nums[i] -1 ];
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        findRightMinimum(nums);

    }
}
