package com.interview.practice.epam.java8;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "()[]{}";
        String str2 = "([)]";

        System.out.println("Is '" + str1 + "' valid? " + isValid(str1));
        System.out.println("Is '" + str2 + "' valid? " + isValid(str2));
    }
}
