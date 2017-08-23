package com.company.sort;

/**
 * 希尔排序:
 * 无法准确猫叔其对于乱序的数组的性能特征的排序方法，个人理解，插入排序的基础上先让数组更有序
 */
public class ShellSort {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,6,4,8,5,7,9};
        sort(a);
        show(a);
        isSorted(a);
    }

    public static void sort(Comparable[] a) {
        int length = a.length;
        int h = 1;
        while (h < length / 3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a,j,j-h);
                }
            }
            h /=3;
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

    private static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
        System.out.println("");
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }
}
