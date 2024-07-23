package com.interview.practice.LeetCodeArray.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

    public static List<Integer> findDuplicate(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int value = Math.abs(nums[i]) - 1;

            if (nums[value] < 0) {
                list.add(Math.abs(nums[i]));
            }
            if(nums[value] > 0){
                nums[value] = -1 * nums[value];
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4, 5};
        System.out.println(findDuplicate(nums));
    }
}
