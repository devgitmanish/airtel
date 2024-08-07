package com.interview.practice.sapient.coderpad.done;

/*
 ** There is a staircase with 'n' number of steps. A child
 ** walks by and wants to climb up the stairs, starting at
 ** the bottom step and ascending to the top.instead
 ** of taking 1 step at a time, it will vary between taking
 ** either 1, 2 or 3 steps at a time.
 ** Given 'n' number of steps below method should find
 ** number of
 ** unique combinations the child could traverse.
 ** An example would be countSteps(3) == 4:
 ** 1 1 1
 ** 2 1
 ** 1 2
 ** 3
 */

public class Staircase {

    static int fibbonacci(int number){
        if(number <= 1){
            return number;
        }
        if(number == 2){
            return 1;
        }
        return fibbonacci(number-1)
                + fibbonacci(number-2)
                + fibbonacci(number-3);
    }
    static int countSteps(int totalSteps){
        // this follows fibbonacci series when value should be sum of last 3 elements (as kid can take upto 3 steps at a time)
        // but there is one thing to notice, the value of ways(n) is equal to fibonacci(n+1).
        // 0 1 1 2 4 7 13....
        return fibbonacci(totalSteps+1);
    }
    public static void main(String[] args) {

        System.out.println(countSteps(3));
    }
}
