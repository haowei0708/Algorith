package com.company.leetcode.index50;

public class PalindromeNumber_9 {

    // 只翻转一半
    public boolean isPalindrome(int x) {

        int halfPalindrome = 0;
        if (x % 10 == 0 && x != 0) return false;
        while (x > halfPalindrome) {
            halfPalindrome = halfPalindrome * 10 + x % 10;
            x /= 10;
        }

        return x == halfPalindrome || x == halfPalindrome / 10;
    }

}
