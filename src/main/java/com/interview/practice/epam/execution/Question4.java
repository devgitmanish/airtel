package com.interview.practice.epam.execution;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given an array, find the pairs of numbers, whose sum = 11
{0, 14, 0, 4, 7, 8, 3, 5, 7}?
 */
public class Question4 {

    public static Set<List<Integer>> targerSumPair(int [] nums, int target){

        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int diff = target - num;
            if (seen.contains(diff)) {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                list.add(diff);
                result.add(list);
            }
            seen.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
         int [] nums = {0, 14, 0, 4, 7, 8, 3, 5, 7};

        targerSumPair(nums, 11)
                .forEach(System.out::println);
    }
}
