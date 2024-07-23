package com.interview.practice.LeetCodeArray.codeBix;

public class ValidPalandromePart2 {

    public static boolean checkValidPalandrome(String str){

        int left =0;
        int right = str.length()-1;

        while(left<right){
            if(!convertCharToString(str.charAt(left))
                    .equalsIgnoreCase(convertCharToString(str.charAt(right)))) {
                    return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String convertCharToString(Character ch){
        return String.valueOf(ch);
    }
    public static void main(String[] args) {

        String str = "RACEcarr";
        boolean result=checkValidPalandrome(str);
        if(result)
            System.out.println("valid palandrome string");
        else
            System.out.println("not valid palandrome string");

    }
}
