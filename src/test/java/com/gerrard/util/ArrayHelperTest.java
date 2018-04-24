package com.gerrard.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ArrayHelperTest {

    private ArrayHelperTest() {

    }

    @Test
    void testSwap() {
        int[] array = {1, 2, 3, 4, 5};
        ArrayHelper.swap(array, 0, 3);
        int[] expectedArray = {4, 2, 3, 1, 5};
        Assertions.assertArrayEquals(expectedArray, array);
    }

    @Test
    void testMoveForwardBySteps() {
        int[] array = {1, 2, 3, 4, 5};
        ArrayHelper.moveForwardBySteps(array, 1, 3, 1);
        int[] expectedArray = {1, 2, 2, 3, 4};
        Assertions.assertArrayEquals(expectedArray, array);
    }

    @Test
    void testMoveBackwardBySteps() {
        int[] array = {1, 2, 3, 4, 5};
        ArrayHelper.moveBackwardBySteps(array, 2, 4, 1);
        int[] expectedArray = {1, 3, 4, 5, 5};
        Assertions.assertArrayEquals(expectedArray, array);
    }

    @Test
    void testMoveBySteps() {
        int[] array = {1, 2, 3, 4, 5};
        ArrayHelper.moveBySteps(array, 1, 3, true, 1);
        int[] expectedArray1 = {1, 2, 2, 3, 4};
        Assertions.assertArrayEquals(expectedArray1, array);
        ArrayHelper.moveBySteps(array, 2, 4, false, 2);
        int[] expectedArray2 = {2, 3, 4, 3, 4};
        Assertions.assertArrayEquals(expectedArray2, array);
    }
}
