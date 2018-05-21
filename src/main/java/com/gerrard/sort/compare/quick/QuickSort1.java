package com.gerrard.sort.compare.quick;

import com.gerrard.util.ArrayHelper;

public class QuickSort1 extends BasicQuickSort {

    @Override
    protected int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int slower = left - 1;
        for (int faster = left; faster < right; ++faster) {
            if (array[faster] <= pivot) {
                /*
                 * Slower-pointer always find elements smaller than pivot.
                 * So the final position indicates the number of smaller elements.
                 * And of cause, the smaller elements are all before final position of slower-pointer.
                 */
                slower++;
                ArrayHelper.swap(array, slower, faster);
            }
        }
        ArrayHelper.swap(array, slower + 1, right);
        return slower + 1;
    }
}
