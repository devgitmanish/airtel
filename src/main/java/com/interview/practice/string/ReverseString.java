package com.interview.practice.string;

public class ReverseString {

    public static String reverse(String str) {

        String returnValue = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            returnValue += str.charAt(i);
        }
        return returnValue;
    }

    public static void reverse2(String str){

        char [] ch = str.toCharArray();

        for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) {
        //System.out.println(reverse("manish"));
        reverse2("manish");
    }
}
