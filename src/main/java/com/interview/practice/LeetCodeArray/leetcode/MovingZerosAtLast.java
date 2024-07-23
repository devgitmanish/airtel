package com.interview.practice.LeetCodeArray.leetcode;

import java.util.Arrays;

public class MovingZerosAtLast {

    public static int[] movingZero(int[] num) {

        if (num.length == 1)
            return num;

        int left = 0;
        for (int right = 0; right < num.length; right++) {

            if (num[right] != 0) {
                num[left] = num[right];
                left++;
            }
        }
        for (int k = left; k < num.length; k++) {
            num[k] = 0;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] num = {5, 0, 2, 0, 7, 0, 3};
        System.out.println(Arrays.toString(movingZero(num)));

    }
}
