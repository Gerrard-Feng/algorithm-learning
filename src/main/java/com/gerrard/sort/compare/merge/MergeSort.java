package com.gerrard.sort.compare.merge;

import com.gerrard.util.ArrayHelper;

public final class MergeSort extends BasicMergeSort {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = ArrayHelper.getMiddle(left, right);
            sort(array, left, mid);
            sort(array, mid + 1, right);
            mergeSolution.merge(array, left, right);
        }
    }
}
