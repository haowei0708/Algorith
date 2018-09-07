package com.company.leetcode.fifty;

public class SearchMatrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // verify
        if (matrix == null || matrix.length == 0
                || matrix[0].length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i;
        // 此处可以修改为二分查找法
        for (i = 0; i < m; i++) {
            if (target < matrix[i][0]) break;
        }
        if (i == 0) return false;
        for (int j = 0; j < n; j++) {
            if (target == matrix[i - 1][j]) return true;
        }
        return false;
    }
}
