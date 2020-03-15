package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void shouldReturnNumberOfEvenDigits() {
        Assertions.assertEquals(
                FindNumbersWithEvenNumberOfDigits.findNumbers(new int[]{12, 345, 2, 6, 7896}),
                0
        );
    }
}