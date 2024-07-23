package com.interview.practice.DesignPattern.SingletonDesignPattern;

/* Bill Pugh Approach Single Design Pattern : Thread Safe Singleton Design Pattern : Reason below
 ----------------------------------------------------------------------------------------------------
* when this programs loads in the memory only LazySingletonDesignPattern class loaded inner class is not
* loaded yet. And if any one calls getInstance() method nothing to get any object.
* ----------------------------------------------------------------------------------------------------
* */
public class LazySingletonDesignPattern {

    private LazySingletonDesignPattern() {
    }

    private static class SingletonHelper {
        private static final LazySingletonDesignPattern instance = new LazySingletonDesignPattern();
    }

    public static LazySingletonDesignPattern getInstance() {
        return SingletonHelper.instance;
    }
}
