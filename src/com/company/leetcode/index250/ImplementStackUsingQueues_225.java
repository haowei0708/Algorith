package com.company.leetcode.index250;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues_225 {

    private Queue<Integer> mQueue;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues_225() {
        mQueue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        mQueue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return 0;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return 0;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return false;
    }
}
