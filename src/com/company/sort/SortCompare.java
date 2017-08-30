package com.company.sort;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 排序算法比较类
 */
public class SortCompare {
    public static void main(String[] args) {
//        Integer[] a = new Integer[100000];
//        for (int i = 0;i < 100000;i++) {
//            a[i] = StdRandom.uniform(1000000);
//        }

        Double[] b = new Double[10000000];
        for (int i = 0;i < 10000000;i++) {
            b[i] = StdRandom.uniform(0.0,1.0);
        }

/*        long insertStart = System.currentTimeMillis();
        InsertionSort.sort(b);
        System.out.println("InsertSort Time:" + (System.currentTimeMillis() - insertStart));
//        InsertionSort.show(a);

        long selectStart = System.currentTimeMillis();
        SelectionSort.sort(b);
        System.out.println("SelectionSort Time:" + (System.currentTimeMillis() - selectStart));
//        InsertionSort.show(a);*/

        long shellStart = System.currentTimeMillis();
        ShellSort.sort(b);
        System.out.println("ShellSort Time:" + (System.currentTimeMillis() - shellStart));

        long mergeStart = System.currentTimeMillis();
        MergeSort.sort(b);
        System.out.println("MergeSort Time:" + (System.currentTimeMillis() - mergeStart));

        long quickStart = System.currentTimeMillis();
        QuickSort.sort(b);
        System.out.println("QuickSort Time:" + (System.currentTimeMillis() - quickStart));
    }
}
