package com.gerrard.helper;

import java.util.Arrays;
import java.util.Random;

public final class ArrayTestHelper {

    private ArrayTestHelper() {

    }

    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int[] createRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; ++i) {
            array[i] = random.nextInt(max - min) + min;
        }
        return array;
    }
}
