package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayPartitionITest {
    @Test
    public void shouldReturnSumOfPairs() {
        Assertions.assertEquals(
                4,
                ArrayPartitionI.arrayPairSum(new int[]{1, 4, 3, 2})
        );
    }
}