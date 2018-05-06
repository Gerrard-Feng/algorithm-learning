package com.gerrard.util;

import java.util.Random;

public final class ArrayHelper {

    private ArrayHelper() {

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int getMiddle(int left, int right) {
        return (left + right) >>> 1;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] array) {
        Random rnd = new Random();
        for (int i = array.length; i > 1; --i) {
            ArrayHelper.swap(array, i - 1, rnd.nextInt(i));
        }
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
