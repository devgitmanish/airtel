package com.interview.practice.sapient.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

    public static void twoSum(int [] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        int [] output = new int[2];

        for(int index=0; index<nums.length; index++){

            int difference = target-nums[index];

            if(map.containsKey(difference)){
                output[0] = map.get(difference);
                output[1] = index;
                break;
            }
            else{
                map.put(nums[index], index);
            }
        }
        System.out.println("After index value of two digit  "+Arrays.toString(output));
        System.out.println("Time Complexity o(n)");
    }

    public static void main(String[] args) {

        int [] nums = {1, 4, 6, 8}; /* Target = 12 index value of two integer*/
        int target = 14;
        System.out.println("Before "+ Arrays.toString(nums));
        twoSum(nums, target);
    }
}
