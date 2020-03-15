package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CountNegativeNumbersInSortedMatrixTest {

    @Test
    public void shouldReturnNumberOfNegativeNumbers() {
        Assertions.assertEquals(
                8,
                CountNegativeNumbersInSortedMatrix.countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}})
        );
    }
}