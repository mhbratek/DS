package com.bratek;

public class CellsWithOddValuesInMatrix {
    public static int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];

        for(int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int column = indices[i][1];

            for (int c = 0; c < m; c++) {
                matrix[row][c]++;
            }
            for (int r = 0; r < n; r++) {
                matrix[r][column]++;
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
