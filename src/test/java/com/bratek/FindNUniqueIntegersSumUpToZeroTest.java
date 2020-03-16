package com.bratek;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindNUniqueIntegersSumUpToZeroTest {

    @Test
    public void shouldReturnArrayWhichSumUpToZero() {
        Assertions.assertArrayEquals(
                new int[] {-4, -2, 0, 2, 4},
                FindNUniqueIntegersSumUpToZero.sumZero(5)
        );
    }
}