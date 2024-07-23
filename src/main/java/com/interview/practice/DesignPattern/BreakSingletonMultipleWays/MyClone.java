package com.interview.practice.DesignPattern.BreakSingletonMultipleWays;

public class MyClone implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
