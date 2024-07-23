package com.interview.practice.LeetCodeArray.tough;

public class MissingNumberInArray {

    public static int sumElement(int number) {

        return (number * (number + 1)) / 2;
    }

    public static int calculate(int[] number) {

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 6;
        int [] nums = {1, 2, 3, 4, 6};
        int missingNumber = sumElement(number) - calculate(nums);
        System.out.println("Missing number "+missingNumber);


    }
}
