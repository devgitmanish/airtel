package com.interview.practice.string;

public class Practice1 {

    public static String reverse(String str) {

        String returnVal = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            returnVal+= str.charAt(i);
        }
        return returnVal;
    }

    public static char [] reverse2(String str){

        char[] arr = str.toCharArray();
        int start =0;
        int last = str.length()-1;

        while (start<=last){
            char temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        String str = "manish";
        //System.out.println(reverse(str));
        System.out.println(reverse2(str));
    }
}
