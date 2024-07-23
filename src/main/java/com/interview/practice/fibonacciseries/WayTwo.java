package com.interview.practice.fibonacciseries;

public class WayTwo {

    public static long[] fibonacciCache;

    public static long fibonacciSeries(int num) {

        /*Base Condition */
        if (num == 0 || num == 1)
            return num;

        if (fibonacciCache[num] != 0)
            return fibonacciCache[num];

        long nthFibonacciCache = fibonacciSeries(num - 1)
                + fibonacciSeries(num - 2);

        fibonacciCache[num] = nthFibonacciCache;

        return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);

    }

    public static void main(String[] args) {

        int num = 50;

        fibonacciCache = new long[num + 1];

        for (int i = 0; i <= num; i++)
            System.out.println(fibonacciSeries(i) + ", ");
        System.out.println("Fibonacci Series End");

    }
}

/*
f(5) = (f4) + f(3)
f(4) = (f3) + f(2)
f(3) = (f2) + f(1)

 */
