package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CellsWithOddValuesInMatrixTest {

    @Test
    public void shouldReturnOddValuesFromMatrix() {
        Assertions.assertEquals(
                6,
                CellsWithOddValuesInMatrix.oddCells(2, 3, new int[][] {{0,1},{1,1}})
        );
    }
}