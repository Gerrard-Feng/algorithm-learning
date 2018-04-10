package com.gerrard.sort.selection;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * A optimization schema for basic selection sort.
 * Select the minimum and maximum at one loop, which can reduce almost half time.
 * Compare to the basic sort, only one thing to regard is that consider the situation that maximum is the first one.
 */
public final class SelectionSort2 implements Sort {

    @Override
    public void sort(int[] array) {
        int minIndex;
        int maxIndex;
        for (int i = 0; i < array.length >> 1; ++i) {
            minIndex = i;
            maxIndex = i;
            for (int j = i; j < array.length - i; ++j) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            ArrayHelper.swap(array, i, minIndex);
            if (i == maxIndex) {
                ArrayHelper.swap(array, array.length - 1 - i, minIndex);
            } else {
                ArrayHelper.swap(array, array.length - 1 - i, maxIndex);
            }
        }
    }
}
