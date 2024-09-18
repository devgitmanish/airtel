package com.interview.practice.sapient.coderpad.done;

public class Power {

    /* Given base and integer exponent, compute value of base raised to the power of exponent.
     * Can you implement a solution faster than O(exp)?
     */
    public static double power(double base, int exp) {
        if (exp == 0) {
            return 1; // Any number raised to the power of 0 is 1
        }
        double result = 1;

        for (int i=0; i<exp; i++){
            result = result * base;
        }
        return result;
    }

    /* returns true if all tests pass, false otherwise */
    public static boolean doTestsPass() {
        boolean doTestsPass = true;
        //doTestsPass = doTestsPass && power(2, 2) == 4;
        doTestsPass = doTestsPass && power(3, 3) == 27;
        return doTestsPass;
    }

    public static void main(String[] args) {
        if (doTestsPass())
            System.out.println("All Tests Pass");
        else
            System.out.println("There are test failures");
    }
}
