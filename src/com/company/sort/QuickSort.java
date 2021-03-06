package com.company.sort;


/**
 * 快速排序
 * 主要思想：递归地选择一个基准值，将小于该基准值的元素放在基准值左边，大于该基准值的放在右边
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 6, 4, 8, 5, 7, 9};
        Integer[] aux = new Integer[7];
        sort(a);
        show(a);
    }

    public static void sort(Comparable[] a) {
//        StdRandom.shuffle(a);
        sort(a,0,a.length -1);
    }

    private static void sort(Comparable[] a,int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) break;
            }
            while (less(v, a[--j])) {
                if (j == lo) break;
            }
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a,lo,j);
        return j;
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
