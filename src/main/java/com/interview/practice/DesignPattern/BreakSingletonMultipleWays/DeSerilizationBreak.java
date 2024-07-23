package com.interview.practice.DesignPattern.BreakSingletonMultipleWays;

import java.io.*;

public class DeSerilizationBreak {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        SingletonPattern singletonPattern_1 = SingletonPattern.getInstance();


        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(singletonPattern_1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonPattern singletonPattern_2 = (SingletonPattern)in.readObject();
        in.close();

        System.out.println(singletonPattern_1.hashCode());
        System.out.println(singletonPattern_2.hashCode());
    }
}
