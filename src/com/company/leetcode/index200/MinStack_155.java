package com.company.leetcode.index200;

import java.util.Stack;

public class MinStack_155 {

    private Stack<Integer> mStack;
    private Stack<Integer> mMinStack;

    /**
     * initialize your data structure here.
     */

    public MinStack_155() {
        mStack = new Stack<>();
        mMinStack = new Stack<>();
    }

    public void push(int x) {
        mStack.push(x);
        if (mMinStack.isEmpty()) {
            mMinStack.push(x);
        } else {
            mMinStack.push(Math.min(x,mMinStack.peek()));
        }
    }

    public void pop() {
        mStack.pop();
        mMinStack.pop();
    }

    public int top() {
        return mStack.peek();
    }

    public int getMin() {
        return mMinStack.peek();
    }
}
