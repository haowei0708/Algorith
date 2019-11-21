package com.company.niu.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class List1 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (listNode == null) return list;

        do {
            list.add(listNode.val);
            listNode = listNode.next;
        } while (listNode != null);
        Collections.reverse(list);
        return list;
    }

}
