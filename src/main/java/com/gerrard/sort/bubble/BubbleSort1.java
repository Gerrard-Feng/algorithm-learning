package com.gerrard.sort.bubble;

import com.gerrard.util.ArrayHelper;
import com.gerrard.sort.Sort;

/**
 * Most common bubble sort, with complexity O(n^2).
 * Compare every adjacent element one by one, if reverse, then swap.
 */
public final class BubbleSort1 implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    ArrayHelper.swap(array, j, j + 1);
                }
            }
        }
    }
}
