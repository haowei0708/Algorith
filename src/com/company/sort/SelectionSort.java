package com.company.sort;

/**
 * 选择排序算法
 * 主要思想：每次*选择*剩余数组的最小值，置于该数组的最低位，剩余的数组再寻找到最小值
 */
public class SelectionSort {
    public static void main(String[] args) {
        // write your code here
        Integer[] a = new Integer[]{1,6,4,8,5,7,9};
        sort(a);
        show(a);
        isSorted(a);
    }
    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
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
