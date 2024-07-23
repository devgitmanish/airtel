package com.interview.practice.DesignPattern.BreakSingletonMultipleWays;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakEnum {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {


        SingletonPatternEnum singletonPattern_1 = SingletonPatternEnum.SINGLETON_ENUM;
        System.out.println(singletonPattern_1.hashCode());


        SingletonPatternEnum singletonBreak = null;
        Constructor[] declaredConstructor
                = SingletonPatternEnum.class.getDeclaredConstructors();

        for (Constructor cons : declaredConstructor) {
            cons.setAccessible(true);
            singletonBreak = (SingletonPatternEnum) cons.newInstance();
        }

        System.out.println(singletonPattern_1.hashCode());
        System.out.println(singletonBreak.hashCode());


    }
}
