package com.interview.practice.DesignPattern.BreakSingletonMultipleWays;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class ClonnableBreak {
    public static void main(String[] args) throws CloneNotSupportedException,
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            IOException, ClassNotFoundException {


        /* Clonnable */
        SingletonPattern singletonPattern_1 = SingletonPattern.getInstance();
        System.out.println(singletonPattern_1.hashCode());

        SingletonPattern singletonPattern_2 = (SingletonPattern) singletonPattern_1.clone();
        System.out.println(singletonPattern_2.hashCode());




    }
}
