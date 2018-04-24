package com.gerrard.sort.compare.selection;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * Most common selection sort, with complexity O(n^2).
 * Use 'PK method' to select the minimum element position, and swap with the first one.
 * Similarly, then select 2nd, 3rd, ..., last minimum one, until the end of array.
 */
public final class SelectionSort1 implements Sort {

    @Override
    public void sort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length; ++i) {
            minIndex = i;
            for (int j = i; j < array.length; ++j) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            ArrayHelper.swap(array, i, minIndex);
        }
    }
}
