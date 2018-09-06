package com.company.leetcode.fifty;

public class RemoveNthNodeFromEndOfList_19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        int length = 0;
        ListNode p = tmp;
        while (p.next != null) {
            length++;
            p = p.next;
        }
        int pre = length - n;
        p = tmp;
        while (pre > 0) {
            pre--;
            p = p.next;
        }
        p.next = p.next.next;
        return tmp.next;
    }

}
