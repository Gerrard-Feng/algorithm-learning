package com.gerrard.sort.quick;

import com.gerrard.util.ArrayHelper;

public final class QuickSort1 extends BasicQuickSort {

    @Override
    protected int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; ++j) {
            if (array[j] <= pivot) {
                /*
                 * Slower-pointer always find elements smaller than pivot.
                 * So the final position indicates the number of smaller elements.
                 * And of cause, the smaller elements are all before final position of slower-pointer.
                 */
                i++;
                ArrayHelper.swap(array, i, j);
            }
        }
        ArrayHelper.swap(array, i + 1, right);
        return i + 1;
    }
}
