package com.interview.practice.DesignPattern.SingletonDesignPattern;

public class EagerSingleton {

    private static final EagerSingleton singletonInstance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return singletonInstance;
    }
}
