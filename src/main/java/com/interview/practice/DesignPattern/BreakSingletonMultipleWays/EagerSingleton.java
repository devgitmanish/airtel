package com.interview.practice.DesignPattern.BreakSingletonMultipleWays;


/*
    Disadvantage is if we are not using this priticular object but object is created
    and stored in memory so it utilize the resources.
 */


public class EagerSingleton {

    private static final EagerSingleton singletonInstance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return singletonInstance;
    }
}
