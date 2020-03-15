package com.bratek;

public class MinimumTimeVisitingAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;

        for (int i = 1; i < points.length; i++) {
            int current[] = points[i];
            int previous[] = points[i - 1];

            result += Math.max(Math.abs(current[0] - previous[0]), Math.abs(current[1] - previous[1]));
        }
        return result;
    }
}
