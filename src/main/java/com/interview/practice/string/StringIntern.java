package com.interview.practice.string;

public class StringIntern {
    public static void main(String[] args) {


        String str1 = "hello";
        String str4 = "manish";
        String str2 = new String("hello");

        System.out.println(str1==str2);


        String str3 = str2.intern();
        System.out.println(str1==str3);
    }
}
