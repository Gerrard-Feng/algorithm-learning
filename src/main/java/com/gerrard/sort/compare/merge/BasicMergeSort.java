package com.gerrard.sort.compare.merge;

import com.gerrard.sort.Sort;

/**
 * Merge-Sort, with complexity O(n*lgn), is also a stable sort solution.
 * Its basic thinking is to separate an array into 2 parts with identical length.
 * Then recursion it self on each part (The end of recursion, of cause is one-length-array, already ordered).
 * Finally, each part is an ordered array, then merge these two parts into one ordered array.
 */
public abstract class BasicMergeSort implements Sort {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            sort(array, left, mid);
            sort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    protected abstract void merge(int[] array, int left, int mid, int right);
}
