package com.interview.practice.SuperThisPro;

class ParentClass{

    ParentClass(){
        System.out.println("ParentClass");
    }
}

public class ChildClass extends  ParentClass{

    ChildClass(){
        super();/*by default*/
        System.out.println("child class");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
    }
}
