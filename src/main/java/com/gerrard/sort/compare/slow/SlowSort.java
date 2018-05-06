package com.gerrard.sort.compare.slow;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * Slow-Sort is an inefficient sort algorithm, with complexity O(n^(logn/2)).
 * Even the best case is slower than Bubble-Sort.
 * <p>
 * It separate array into two parts, and sort these two parts recursively.
 * Find the maximum element by comparing the results of two parts and place it at the end of the array.
 * Then recursively sort entire array without maximum element.
 */
public class SlowSort implements Sort {

    @Override
    public void sort(int[] array) {
        slowSort(array, 0, array.length - 1);
    }

    private void slowSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = ArrayHelper.getMiddle(left, right);
        slowSort(array, left, mid);
        slowSort(array, mid + 1, right);
        if (array[right] < array[mid]) {
            ArrayHelper.swap(array, right, mid);
        }
        slowSort(array, left, right - 1);
    }
}
