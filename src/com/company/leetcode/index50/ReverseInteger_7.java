package com.company.leetcode.index50;

public class ReverseInteger_7 {

    //   MAX_VALUE = 0x7fffffff;
    //  MIN_VALUE = 0x80000000;
    public int reverse(int x) {
        long r = 0;
        while (x != 0) {
            int num = x % 10;
            x /= 10;
            r = r * 10 + num;
            if ( r < Integer.MIN_VALUE || r > Integer.MAX_VALUE) {
                r = 0;
                break;
            }
        }

        return (int) r;
    }

}
