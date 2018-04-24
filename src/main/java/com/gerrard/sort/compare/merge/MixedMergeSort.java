package com.gerrard.sort.compare.merge;

import com.gerrard.sort.Sort;

/**
 * This is the mixture for Merge-Sort.
 * Absolutely for smaller array merge, Insertion-Sort is better.
 * While for large scope, the new space will be worth cost.
 * So in this solution, the "merge" operation will be separate into 2 scenario.
 * A parameter called threshold is used here, below it, use insertion; over it, use new space.
 */
public class MixedMergeSort implements Sort {

    private int threshold = 2 << 4;

    private BasicMergeSort sort1 = new MergeSort1();
    private BasicMergeSort sort2 = new MergeSort2();

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            sort(array, left, mid);
            sort(array, mid + 1, right);
            if (right - left > threshold) {
                sort1.merge(array, left, mid, right);
            } else {
                sort2.merge(array, left, mid, right);
            }
        }
    }
}
