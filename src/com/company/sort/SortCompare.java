package com.company.sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 排序算法比较类
 */
public class SortCompare {
    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0;i < 100000;i++) {
            a[i] = StdRandom.uniform(10000);
        }

        long insertStart = System.currentTimeMillis();
        InsertionSort.sort(a);
        System.out.println("InsertSort Time:" + (System.currentTimeMillis() - insertStart));
        InsertionSort.show(a);

        long selectStart = System.currentTimeMillis();
        InsertionSort.sort(a);
        System.out.println("selectStart Time:" + (System.currentTimeMillis() - selectStart));
        InsertionSort.show(a);
    }
}
