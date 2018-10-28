package com.gerrard.helper;

import com.gerrard.sort.Sort;

public final class ComparableTestHelper {

    private ComparableTestHelper() {

    }

    public static void printCompareResult(int[] array, Sort... sorts) {
        for (Sort sort : sorts) {
            int[] copyArray = ArrayTestHelper.copyArray(array);
            long t1 = System.nanoTime();
            sort.sort(copyArray);
            long t2 = System.nanoTime();
            double timeInSeconds = (t2 - t1) / Math.pow(10, 9);
            System.out.println("Algorithm " + sort + ", using " + timeInSeconds + " seconds");
        }
    }
}
