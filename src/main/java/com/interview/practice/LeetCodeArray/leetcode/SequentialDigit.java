package com.interview.practice.LeetCodeArray.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigit {


    public static List<Integer> sequenticalDigit(int low, int high) {

        String numberSequence = "123456789";

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {

            for (int k = 0; i + k <= 9; k++) {

                String temp = numberSequence.substring(k, i+k);
                System.out.println(temp);

                int value = Integer.valueOf(temp);

                if (value >= low && value <= high) {
                    list.add(value);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(sequenticalDigit(10, 50));

    }
}
