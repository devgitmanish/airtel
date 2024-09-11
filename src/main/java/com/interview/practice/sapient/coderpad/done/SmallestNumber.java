package com.interview.practice.sapient.coderpad.done;

public class SmallestNumber {

    public static int FindMin(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // the minimum is in the right half
            if (a[mid] > a[right]) {
                left = mid + 1;
            } else {
                // If mid element is less than or equal to the rightmost
                // element, the minimum is in the left half
                right = mid;
            }
        }

        // Left and right should converge to the index of the smallest element
        return a[left];
    }

    public static void main(String[] args) {
        boolean result = true;
        result = result && FindMin(new int[]{3, 4, 5, 6, 1, 2}) == 1;
        result = result && FindMin(new int[]{2, 1}) == 1;
        result = result && FindMin(new int[]{1}) == 1;

//        try {
//            FindMin(null);
//            result = false;
//        } catch (Exception e) {
//            result = result;
//        }

        if (result) {
            System.out.println("All tests pass");
        } else {
            System.out.println("There are test failures");
        }
    }

}
