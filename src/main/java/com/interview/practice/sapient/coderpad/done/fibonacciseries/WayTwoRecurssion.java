package com.interview.practice.sapient.coderpad.done.fibonacciseries;

public class WayTwoRecurssion {

    private static long[] fibonacciCache;

    public static long printFibonacci(int num) {

        /* base case */
        if (num == 1 || num == 0)
            return num;

        if(fibonacciCache[num]!=0)
            return fibonacciCache[num];

        /* store */
        long nthFibonacciNumber = (printFibonacci(num - 1)
                + printFibonacci(num - 2));

        fibonacciCache[num] = nthFibonacciNumber;

        return printFibonacci(num - 1) + printFibonacci(num - 2);
    }

    public static void main(String[] args) {

        int num = 50;
        fibonacciCache = new long[num + 1];
        System.out.println(printFibonacci(num));


    }
}

//0,1,1,2,3,5,8