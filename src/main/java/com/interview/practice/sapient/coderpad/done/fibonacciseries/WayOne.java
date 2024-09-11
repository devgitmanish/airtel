package com.interview.practice.sapient.coderpad.done.fibonacciseries;

public class WayOne {

    public static void printFibonacci(int num) {
        long num1 = 0;
        long num2 = 1;
        long sum = 0;

        for (int i = 0; i < num; i++) {
            sum = num1 + num2;

            System.out.println(sum + ", ");

            num1 = num2;
            num2 = sum;
        }
    }
    public static void main(String[] args) {
        printFibonacci(20);
    }
}
