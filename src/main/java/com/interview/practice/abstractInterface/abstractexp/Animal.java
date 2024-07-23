package com.interview.practice.abstractInterface.abstractexp;

public abstract class Animal {

    /*
       abstract class can have any kind of variable public private static final anything there
       is no restirction.

       but method always public abstract

       we can create a constructor in abstract class;

       we can not use final along with public abstract
     */

    private final int a = 0;
    private static final String h = "ram";

    public int age = 0;
    public static String c = "manish";
    public static final String d = "negi";

    public abstract void makeSound();


    /*

    private abstract void makeSound3();  - we can not make it private with abstract
    public abstract final void makeSound2();  - compliation error never be final

    */

    Animal(int age){
        this.age = age;
    }



}
