package com.gerrard.sort.compare.merge;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

public class OptimizedMergeSort implements Sort {

    private int threshold = 64;

    private Merge mergeSolution1 = new SpaceCostMerge();
    private Merge mergeSolution2 = new TimeCostMerge();

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
            int mid = ArrayHelper.getMiddle(left, right);
            sort(array, left, mid);
            sort(array, mid + 1, right);
            if (right - left > threshold) {
                mergeSolution1.merge(array, left, right);
            } else {
                mergeSolution2.merge(array, left, right);
            }
        }
    }
}
