package com.interview.practice.LeetCodeArray.leetcode;

import java.util.Arrays;

public class ProductArrayExpectSelf {

    public static int [] productExpectSelf(int [] nums){

        int [] prefixProduct = new int[nums.length];

        prefixProduct[0] = 1;

        for(int index=1; index<nums.length; index++){

            prefixProduct[index] = prefixProduct[index-1]* nums[index-1];
        }
        int suffixProduct = 1;

        for(int index=nums.length-1; index>=0; index--){

            prefixProduct[index] = prefixProduct[index] * suffixProduct;
            suffixProduct = suffixProduct * nums[index];
        }
        return prefixProduct;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExpectSelf(nums)));
    }
}
