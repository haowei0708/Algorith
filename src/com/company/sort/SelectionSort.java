package com.company.sort;

/**
 * 选择排序算法
 * 主要思想：数组中找到最小值放入在最左边，剩余的数组再寻找到最小值
 */
public class SelectionSort {
    public static void main(String[] args) {
        // write your code here
        int[] a = new int[]{1,6,4,8,5,7,9};
        sort(a);
        show(a);
        isSorted(a);
    }
    public static void sort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    private static boolean less(int a, int b) {
        return a < b;
    }

    private static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        System.out.println("is Sorted");
        return true;
    }
}
