package com.bratek;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindNUniqueIntegersSumUpToZeroTest {

    @Test
    public void shouldReturnArrayWhichSumUpToZero() {
        Assertions.assertArrayEquals(
                new int[] {0, 1, -1, 2, -2},
                FindNUniqueIntegersSumUpToZero.sumZero(5)
        );
    }
}