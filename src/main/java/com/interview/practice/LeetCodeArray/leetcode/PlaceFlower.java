package com.interview.practice.LeetCodeArray.leetcode;

import java.util.Arrays;

public class PlaceFlower {

    public static boolean canPlaceFlower(int[] flowerBed, int output) {

        int count = 0;

        for (int index = 0; index < flowerBed.length; index++) {

            if (flowerBed[index] == 0) {

                boolean emptyLeftIndex = (index - 1 < 0 || flowerBed[index - 1] == 0);
                boolean emptyRightIndex = (index + 1 >= flowerBed.length || flowerBed[index + 1] == 0);

                if (emptyLeftIndex && emptyRightIndex) {
                    count++;
                    System.out.println("Count Value " + count);
                    flowerBed[index] = 1;
                }
            }
        }
        return count >= output;
    }
    public static void main(String[] args) {
        int[] flowerBed = {1, 0, 1, 0, 1, 0};
        System.out.println(canPlaceFlower(flowerBed, 1));
    }
}
