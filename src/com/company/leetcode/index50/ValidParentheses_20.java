package com.company.leetcode.index50;

import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt == '(' || charAt == '[' || charAt == '{') {
                stack.push(charAt);
            } else {
                if (stack.isEmpty()) return false;
                Character pop = stack.pop();
                if ((pop == '(' && charAt == ')') || (pop == '[' && charAt == ']') || (pop == '{' && charAt == '}')) {
                    continue;
                }
                return false;
            }

        }
        return stack.isEmpty();
    }

}
