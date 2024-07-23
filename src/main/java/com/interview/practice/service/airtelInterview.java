package com.interview.practice.service;


public class airtelInterview {


     /*

     7 is greater than 5 so count is 1
     7 is greater than -110 so count is 2
     7 is greater than 6 so count is 3

     out put 3,

     5 is less than 7 so count is 0
     5 is greater than -110 so count is 1 and all rest of the digit is greater than 5 output is 1


     int input [] = {7, 5, -110, 90, 23, 6};
    count of those element
    int output [] = {3,1,0,5,4,2};

    */


    /* Stock Market

      [1, 7, 9, 5, 2] -> 9-1 : 8
     [4,3,2,1] -> 0 */

    //int input [] = {7, 5, -110, 90, 23, 6};
    //int output [] = {3,1,0,5,4,2};

    public static void main(String[] args) {


        int[] input = {7, 5, -110, 90, 23, 6};
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[j] > input[i]) {
                    count++;
                }
            }
            output[i] = count;
        }

        // Printing the output array
        for (int count : output) {
            System.out.print(count + " ");
        }
    }
}


