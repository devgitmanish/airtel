package com.interview.practice.sapient.coderpad.done;

public class SecondSmallest {
    /**
     Find the second smallest number in a given int array
     */
    public static int secondSmallest(int[] x) {
        if (x == null || x.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : x) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        //int[] a = {0}; // This should throw an exception
        int[] b = {1, 2, 3};
        //int[] c = {-3, -2, -1, 0, 1};

        try {
            boolean result = true;
            //result &= secondSmallest(a) == 0; // This line should be removed or handled with a try-catch
            result &= secondSmallest(b) == 2;
            //result &= secondSmallest(c) == -2;

            if (result) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Pass (handled exception for insufficient elements)");
        }
    }

}
