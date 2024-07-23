package com.interview.practice.diamondProblem.problem;

class Parent1{

    void max(){
        System.out.println("max parent 1");
    }
}

class Parent2{

    void max(){
        System.out.println("max parent 2");
    }
}

/* Diamond Problem
* Due to diamond problem multiple inheritance is not allowed in java
* here complier confuse which method will call. */
//public class Execution extends  Parent1, Parent2{


//}
