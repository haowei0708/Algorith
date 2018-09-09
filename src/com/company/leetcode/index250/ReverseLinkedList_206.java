package com.company.leetcode.index250;

public class ReverseLinkedList_206 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }

        int[] nums = new int[len];
        cur = head;
        for (int i = 0; i < len; i++) {
            nums[i] = cur.val;
            cur = cur.next;
        }

        cur = head;
        for (int i = len - 1; i >= 0; i--) {
            cur.val = nums[i];
            cur = cur.next;
        }

        return head;
    }

    // 参考答案：（0ms）
/*    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (null != head) {
            ListNode temp = head;
            head = head.next;
            temp.next = pre;
            pre = temp;
        }

        return pre;
    }*/
}
