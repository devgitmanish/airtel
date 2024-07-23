package com.interview.practice.epam.execution;


import java.util.Arrays;

/*
)Print the square of even numbers from given array {1,2,3,4,5,6,7,8,9,10}?
 */
public class Question3 {

    public static int[] squreEvenNumber(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[i] = nums[i] * nums[i];
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(squreEvenNumber(nums)));
    }
}
