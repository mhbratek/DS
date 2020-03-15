package com.bratek;

public class CountNegativeNumbersInSortedMatrix {
    public static int countNegatives(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            int j = grid[i].length - 1;
            while (j >= 0 && grid[i][j] < 0) {
                result++;
                j--;
            }
        }
        return result;
    }
}
