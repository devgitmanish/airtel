package com.interview.practice.diamondProblem.problem;

public class Main implements Interface1, Interface2{

    @Override
    public void display() {

        /* keep in mind display method in interface2 should be default */

        Interface2.super.display();

    }

    public static void main(String[] args) {

        Main m = new Main();
        m.display();
    }
}
