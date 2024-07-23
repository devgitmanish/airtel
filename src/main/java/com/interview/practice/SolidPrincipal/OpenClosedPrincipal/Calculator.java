package com.interview.practice.SolidPrincipal.OpenClosedPrincipal;

public class Calculator {

    public int command(Operation operation, int num1, int num2){
        return operation.mathOperation(num1, num2);
    }
}
