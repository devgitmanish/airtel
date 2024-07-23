package com.interview.practice.fibonacciseries;

public class NormalFibonacci {

    public static long printFibonacci(int num) {

        if (num <= 1)
            return num;

        return (printFibonacci(num - 1) + printFibonacci(num - 2));
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(printFibonacci(i));
        }
        //System.out.println(printFibonacci(4));
    }
}

