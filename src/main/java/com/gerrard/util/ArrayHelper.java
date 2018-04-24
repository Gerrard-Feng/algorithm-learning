package com.gerrard.util;

public final class ArrayHelper {

    private ArrayHelper() {

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void moveForwardBySteps(int[] array, int from, int to, int steps) {
        for (int i = to; i >= from; --i) {
            array[i + steps] = array[i];
        }
    }

    public static void moveBackwardBySteps(int[] array, int from, int to, int steps) {
        for (int i = from; i <= to; ++i) {
            array[i - steps] = array[i];
        }
    }

    public static void moveBySteps(int[] array, int from, int to, boolean forward, int steps) {
        int destPos = forward ? from + steps : from - steps;
        System.arraycopy(array, from, array, destPos, to - from + 1);
    }
}
