package com.interview.practice.sapient.coderpad.done;
/*
 ** Instructions to candidate.
 **  1) Given an array of non-negative integers representing the elevations
 **     from the vertical cross section of a range of hills, determine how
 **     many units of snow could be captured between the hills.
 **
 **     See the example array and elevation map below.
 **                                 ___
 **             ___                |   |        ___
 **            |   |        ___    |   |___    |   |
 **         ___|   |    ___|   |   |   |   |   |   |
 **     ___|___|___|___|___|___|___|___|___|___|___|___
 **     {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
 **                                 ___
 **             ___                |   |        ___
 **            |   | *   *  _*_  * |   |_*_  * |   |
 **         ___|   | *  _*_|   | * |   |   | * |   |
 **     ___|___|___|_*_|___|___|_*_|___|___|_*_|___|___
 **     {0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0}
 **
 **     Solution: In this example 13 units of snow (*) could be captured.
 **
 **  2) Consider adding some additional tests in doTestsPass().
 **  3) Implement computeSnowpack() correctly.
 */
public class Snowpack {

    /**
     * Solution is to traverse every array element (can be pre computed)
     * and find the highest bars from all on left, do same for right as well.
     * Take the smaller of two heights.
     * The difference between the smaller height and height of the current
     * element is the amount of water that can be stored in this array element.
     */
    static void computeSnowpack(int[] arr) {

        int waterUnits = 0;
        int[] left = new int[arr.length];
        // will contain height of tallest bar to the left of i'th bar including itself

        int[] right = new int[arr.length];
        // will contain height of tallest bar to the right of i'th bar including itself

        // preset for boundary co-ordinates
        left[0] = arr[0];
        // first element will not have anything on left, so initialize here

        right[arr.length - 1] = arr[arr.length - 1];
        //last element will not have anything on right, so initialize here

        for (int i = 1; i < arr.length; i++) {
            //  Note that 2nd argument is 'leftMax' for previous index, this takes care of max till prev index and before.
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            //  Note that 2nd argument is 'rightMax' for next index, this takes care of max next index onwards.
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        // calculate accumulated water for each hill
        for (int i = 0; i < arr.length; i++) {
            int localUnits = Math.min(left[i], right[i]) - arr[i];
            waterUnits = waterUnits+localUnits;
        }
        System.out.println("Collected water units :: " + waterUnits);
    }

    public static void main(String[] args) {
        computeSnowpack(new int[]{0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0}) ; //output = 13
        computeSnowpack(new int[]{2, 0, 2}) ;                           //output = 2
        computeSnowpack(new int[]{3, 0, 0, 2, 0, 4}) ;                  //output = 10
        computeSnowpack(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}) ; //output = 6
    }
}
