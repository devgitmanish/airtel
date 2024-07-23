package com.interview.practice.DesignPattern.BreakSingletonMultipleWays;

import java.io.Serializable;

public class SingletonPattern extends MyClone implements Serializable {

    private static SingletonPattern singletonInstance;


    /* How to Prevent Via Reflection */
    private SingletonPattern() {
        if (singletonInstance != null) {
            throw new IllegalStateException("Object can't created using reflection");
        }
    }

    /* How to Prevent Via Clonnable */

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    protected Object readResolve(){
        return singletonInstance;
    }

    public static SingletonPattern getInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonPattern.class) {
                if (singletonInstance == null) {
                    singletonInstance = new SingletonPattern();
                }
            }
        }
        return singletonInstance;
    }
}
