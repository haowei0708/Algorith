package com.company.sort;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Example {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 6, 4, 8, 5, 7, 9};
        int i = 0;
        int j = 6;
        System.out.print(a[i++] + " ");
        System.out.print(a[--j] + " ");

    }

    public static void sort(Comparable[] a)  {

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

    private static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])) return false;
        }
        return true;
    }
}
