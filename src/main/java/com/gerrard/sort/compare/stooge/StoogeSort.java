package com.gerrard.sort.compare.stooge;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * Stooge-Sort is an inefficient sort algorithm, with complexity O(n^(log3/log1.5)) = O(n^2.71).
 * Every time compare the start and end index and swap if in wrong ordered.
 * Then separate array into 3 parts.
 * Recursively sort first 2/3 parts, and then last 2/3 parts, finally first 2/3 parts again.
 */
public final class StoogeSort implements Sort {

    @Override
    public void sort(int[] array) {
        stoogeSort(array, 0, array.length - 1);
    }

    private void stoogeSort(int[] array, int left, int right) {
        if (array[left] > array[right]) {
            ArrayHelper.swap(array, left, right);
        }
        int length = right - left + 1;
        if (length > 2) {
            int t = length / 3;
            stoogeSort(array, left, right - t);
            stoogeSort(array, left + t, right);
            stoogeSort(array, left, right - t);
        }
    }
}
