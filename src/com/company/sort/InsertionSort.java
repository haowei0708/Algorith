package com.company.sort;

public class InsertionSort {
    public static void main(String[] args) {
        // write your code here
        int[] a = new int[]{1, 6, 4, 8, 5, 7, 9};
        sort(a);
        show(a);
        isSorted(a);
    }

    public static void sort(int[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) exch(a, j, j - 1);
                else break;
            }
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

    private static void show(int[] a) {
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
