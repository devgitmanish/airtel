package com.interview.practice.LeetCodeArray.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean duplicateElements(int [] nums){

        Set<Integer> distnict = new HashSet<>();

        for(int index=0; index<nums.length; index++){
            if(distnict.contains(nums[index]))
                return true;
            else
                distnict.add(nums[index]);
        }
       return false;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 1};
        System.out.println(duplicateElements(nums));

    }
}
