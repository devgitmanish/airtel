package com.interview.practice.sapient.coderpad.done.fibonacciseries;

public class Practice1 {

    private static long [] fibonacciCache;

    public static long fibonacci(int num) {

        /* Base Case */
        if (num <= 1)
            return num;

        if(fibonacciCache[num]!=0)
            return fibonacciCache[num];

        long nthFibonacci = fibonacci(num - 1) + fibonacci(num - 2);
        fibonacciCache[num] = nthFibonacci;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        int num = 60;

        fibonacciCache = new long[num+1];

        for (int i = 0; i <= num; i++) {
            System.out.println(fibonacci(i) +", ");
        }
        System.out.println("\n END....");
    }
}

/*
    f(10) = f(9)+f(8)
    f(5) = f(4)+f(3)
    f(4) = f(3)+f(2)
    f(3) = f(2)+f(1)


 */

