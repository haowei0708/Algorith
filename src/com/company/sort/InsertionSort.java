package com.company.sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 插入排序
 * 主要思想：将一个值与左边值依次比较，插入到合适的位置 ，sort过程中，左边数组是已排好顺序的数组
 */
public class InsertionSort {
    public static void main(String[] args) {
        // write your code here
        Integer[] a = new Integer[]{1, 6, 4, 8, 5, 7, 9};
        sort(a);
        show(a);
        isSorted(a);
    }

    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) exch(a, j, j - 1);
                else break;
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
        System.out.println("");
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        System.out.println("is Sorted");
        return true;
    }
}
