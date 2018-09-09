package com.company.leetcode.index150;

import java.util.Arrays;

public class InsertionSortList_147 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // get length
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        // to array
        int[] nums = new int[len];
        cur = head;
        for (int i = 0; i < len; i++) {
            nums[i] = cur.val;
            cur = cur.next;
        }

        // sort
        Arrays.sort(nums);
        cur = head;
        for (int i = 0; i < len; i++) {
            cur.val = nums[i];
            cur = cur.next;
        }

        return head;
    }
}
