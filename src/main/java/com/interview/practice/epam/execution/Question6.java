package com.interview.practice.epam.execution;

import java.util.Stack;

public class Question6 {

    public static boolean validParanthesis(String str) {

        int countOpenParanthesis = 0;
        int countOpenSquareParanthesis = 0;
        int countOpenCurlyParanthesis = 0;

        for (char c : str.toCharArray()) {

            if (c == '(')
                countOpenParanthesis++;
            else if (c == '[')
                countOpenSquareParanthesis++;
            else if (c == '{')
                countOpenCurlyParanthesis++;

            else if (c == ')') {
                if (countOpenParanthesis == 0) {
                    return false;
                }
                countOpenParanthesis--;
            } else if (c == ']') {
                if (countOpenSquareParanthesis == 0) {
                    return false;
                }
                countOpenSquareParanthesis--;
            } else if (c == '}') {
                if (countOpenCurlyParanthesis == 0) {
                    return false;
                }
                countOpenCurlyParanthesis--;
            }
        }
        return countOpenParanthesis==0 && countOpenSquareParanthesis==0
                && countOpenCurlyParanthesis==0;
    }


    public static boolean validStackParantheis(String st){

        Stack<Character> stack = new Stack<>();

        for(char ch : st.toCharArray()){
            if(ch=='(')
                stack.push(')');
            else if(ch == '[')
                stack.push(']');
            else if(ch=='{')
                stack.push('}');
            else if(stack.isEmpty() || ch!=stack.pop())
                return false;
        }
        return stack.isEmpty();


    }

    public static void main(String[] args) {
        String str1 = "(){}[]";
        String str2 = "(}{)[]";
        System.out.println("Valid Paranthesis 1 "+validParanthesis(str1));
        System.out.println("Valid Paranthesis 2 "+validParanthesis(str2));

        System.out.println("Valid validStackParantheis 1 "+validStackParantheis(str1));
        System.out.println("Valid validStackParantheis 2 "+validStackParantheis(str2));



    }
}
