package com.interview.practice.SolidPrincipal.OpenClosedPrincipal;

public class BadExample {

    public int doOperations(int num1, int num2, String type) {
        int result = 0;

        switch(type) {
            case "SUM":
                result = num1 + num2;
                break;
            case "SUB":
                result = num1 - num2;
        }
        return result;
    }
}
