package com.interview.practice.SolidPrincipal.OpenClosedPrincipal;

public class Addition implements Operation {
    @Override
    public int mathOperation(int num1, int num2) {
        return num1+num2;
    }
}