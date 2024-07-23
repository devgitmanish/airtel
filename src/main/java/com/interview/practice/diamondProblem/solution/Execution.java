package com.interview.practice.diamondProblem.solution;

public class Execution implements Interface1, Interface2{


    public void max(){
        Interface2.super.max();
    }

    public static void main(String[] args) {

        Execution ex = new Execution();
        ex.max();

    }


}
