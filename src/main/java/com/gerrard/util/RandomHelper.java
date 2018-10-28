package com.gerrard.util;

import java.util.Random;

public final class RandomHelper {

    private static Random random = new Random();

    private RandomHelper() {

    }

    public static int randomBetween(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}
