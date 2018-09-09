package com.company.leetcode.index50;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        AddTwoNumbers_2 addTwoNumbers2 = new AddTwoNumbers_2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers2.addTwoNumbers(l1, l2);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Value = l1 == null ? 0 : l1.val;
            int l2Value = l2 == null ? 0 : l2.val;
            int sum = l1Value + l2Value + carry;
            carry = sum / 10;
            int value = sum - carry * 10;
            tmp.next = new ListNode(value);
            tmp = tmp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            tmp.next = new ListNode(1);
        }
        return result.next;
    }
}
