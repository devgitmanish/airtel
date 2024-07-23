package com.interview.practice.epam.execution;

import java.util.HashMap;
import java.util.Map;

public class Question7 {

    public static int maxLengthSubarray(int[] arr, int target) {
        int length = 0;
        int sum = 0;
        //15, 4, -2, 2, -3, 1, 3, 3, 0
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == target) {
                length = i + 1;
            } else if (map.containsKey(sum - target)) {
                length = Math.max(length, i - map.get(sum - target));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {15, 4, -2, 2, -3, 1, 3, 3, 0};
        int targetSum = 4;

        System.out.println("Length of the largest continuous subarray with sum " + targetSum + ": " + maxLengthSubarray(arr, targetSum));
    }
}
