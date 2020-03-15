package com.bratek;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumTimeVisitingAllPointsTest {

    @Test
    public void shouldReturnMinimumTime() {
        Assertions.assertEquals(
                MinimumTimeVisitingAllPoints.minTimeToVisitAllPoints(new int [][]{{1,1},{3,4},{-1,0}}),
                7
        );
    }
}