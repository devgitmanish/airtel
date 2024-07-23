package com.interview.practice.DesignPattern.SingletonDesignPattern;

import com.interview.practice.DesignPattern.BreakSingletonMultipleWays.SingletonPattern;

class SingletonDesignPattern {

    private static SingletonDesignPattern singletonInstance;

    private SingletonDesignPattern(){

    }
    public static SingletonDesignPattern getInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonPattern.class) {
                if (singletonInstance == null) {
                    singletonInstance = new SingletonDesignPattern();
                }
            }
        }
        return singletonInstance;
    }
}



