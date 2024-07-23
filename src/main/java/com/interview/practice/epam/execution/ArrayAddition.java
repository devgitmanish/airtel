package com.interview.practice.epam.execution;

import java.util.Arrays;

public class ArrayAddition {

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength + 1];
        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr1[i];
                i--;
            }
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }
            result[k] = sum % 10;
            carry = sum / 10;
            k--;
        }

        if (carry > 0) {
            result[k] = carry;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 8, 9};
        int[] arr2 = {9, 9};

        int[] result = addArrays(arr1, arr2);

        System.out.println("addition:" +Arrays.toString(result));

    }
}