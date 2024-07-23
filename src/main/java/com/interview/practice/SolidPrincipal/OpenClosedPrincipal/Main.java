package com.interview.practice.SolidPrincipal.OpenClosedPrincipal;

public class Main {

    /* Follow Command Design Pattern */

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();

        System.out.println(calculator1.command(new Addition(), 5, 4));

        System.out.println(calculator1.command(new Substract(), 5, 4));

    }
}
