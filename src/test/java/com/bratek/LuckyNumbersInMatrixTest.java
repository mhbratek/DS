package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;


class LuckyNumbersInMatrixTest {

    @Test
    public void shouldReturnListOfLuckyNumbers() {
        Assertions.assertEquals(
                Collections.singletonList(15),
                LuckyNumbersInMatrix.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}})
        );
    }
}