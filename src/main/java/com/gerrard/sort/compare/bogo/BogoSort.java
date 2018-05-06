package com.gerrard.sort.compare.bogo;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * Bogo-Sort is a tricky sort algorithm, shuffle array randomly until it is sorted.
 * The average complexity may be O(n*n!).
 */
public class BogoSort implements Sort {

    @Override
    public void sort(int[] array) {
        while (!ArrayHelper.isSorted(array)) {
            ArrayHelper.shuffle(array);
        }
    }
}
