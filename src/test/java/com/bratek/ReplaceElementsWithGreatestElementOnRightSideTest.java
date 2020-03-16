package com.bratek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void shouldReplaceElements() {
        Assertions.assertArrayEquals(
                new int[]{18, 6, 6, 6, 1, -1},
                ReplaceElementsWithGreatestElementOnRightSide.replaceElements(new int[]{17, 18, 5, 4, 6, 1})
        );
    }
}