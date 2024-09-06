package com.interview.practice.sapient.java8;

public class ValidPalandrome {

    public static boolean checkValidPalandrome(String str){

        int left =0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "racecare";
        boolean result=checkValidPalandrome(str);
        if(result)
            System.out.println("valid palandrome string");
        else
            System.out.println("not valid palandrome string");


    }
}
