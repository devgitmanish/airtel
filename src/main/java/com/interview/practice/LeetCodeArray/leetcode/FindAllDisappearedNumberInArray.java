package com.interview.practice.LeetCodeArray.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedNumberInArray {

    public static List<Integer> findDisappearNumber(int[] nums) {

        for (int index = 0; index < nums.length - 1; index++) {

            int pointer = Math.abs(nums[index]) - 1;

            if (nums[pointer] > 0) {
                /* not marked */
                nums[pointer] = nums[pointer] * -1;
            }
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        System.out.println(findDisappearNumber(nums));
    }

    //TC o(2*n) = o(n)
}
