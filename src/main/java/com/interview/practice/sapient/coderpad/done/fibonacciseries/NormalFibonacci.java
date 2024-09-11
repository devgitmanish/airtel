package com.interview.practice.sapient.coderpad.done.fibonacciseries;

public class NormalFibonacci {

    public static long printFibonacci(int num) {

        if (num <= 1)
            return num;

        return (printFibonacci(num - 1) + printFibonacci(num - 2));
    }

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.print(printFibonacci(i)+", ");
        }
    }
}

