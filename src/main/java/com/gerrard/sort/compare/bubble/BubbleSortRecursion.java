package com.gerrard.sort.compare.bubble;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

public final class BubbleSortRecursion implements Sort {

    @Override
    public void sort(int[] array) {
        recursion(array, 0, array.length - 2);
    }

    private void recursion(int[] array, int left, int right) {
        if (right > 0) {
            if (array[left] > array[left + 1]) {
                ArrayHelper.swap(array, left, left + 1);
            }
            if (left >= right) {
                recursion(array, 0, right - 1);
            } else {
                recursion(array, left + 1, right);
            }
        }
    }
}