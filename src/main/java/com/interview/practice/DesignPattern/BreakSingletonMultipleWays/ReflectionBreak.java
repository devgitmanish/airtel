package com.interview.practice.DesignPattern.BreakSingletonMultipleWays;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreak {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {


        SingletonPattern singletonPattern_1 = SingletonPattern.getInstance();
        System.out.println(singletonPattern_1.hashCode());


        SingletonPattern singletonBreak = null;
        Constructor[] declaredConstructor
                = SingletonPattern.class.getDeclaredConstructors();

        for (Constructor cons : declaredConstructor) {
            cons.setAccessible(true);
            singletonBreak = (SingletonPattern) cons.newInstance();
        }

        System.out.println(singletonPattern_1.hashCode());
        System.out.println(singletonBreak.hashCode());


    }
}
