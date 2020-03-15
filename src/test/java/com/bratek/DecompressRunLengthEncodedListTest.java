package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DecompressRunLengthEncodedListTest {

    @Test
    public void shouldDecompressArray() {
        Assertions.assertArrayEquals(
                DecompressRunLengthEncodedList.decompressRLElist(new int[]{1, 2, 3, 4}),
                new int[]{2, 4, 4, 4}
        );
    }

}