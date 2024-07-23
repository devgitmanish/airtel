package com.interview.practice.epam.java8;

import org.apache.logging.log4j.util.Strings;

public class StringExe {

    public static void main(String[] args) {
        String s1= new String("abc");
        String s2= new String("abc");
        String s3="abc";
        String s4="abc";

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        System.out.println(s1.equals(s2));
    }
}
