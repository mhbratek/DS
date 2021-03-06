package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void shouldReturnNumberOfEvenDigits() {
        Assertions.assertEquals(
                2,
                FindNumbersWithEvenNumberOfDigits.findNumbers(new int[]{12, 345, 2, 6, 7896})
        );
    }
}