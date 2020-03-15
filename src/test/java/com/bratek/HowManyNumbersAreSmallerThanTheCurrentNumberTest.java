package com.bratek;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    public void shouldReturnArrayOfOccurenceOfSmallerNumbers() {

        Assertions.assertArrayEquals(
                HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(new int []{8, 1, 2, 2, 3}),
                new int[] {4, 0, 1, 1, 3}
        );
    }
}