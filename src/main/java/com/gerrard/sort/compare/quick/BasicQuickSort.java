package com.gerrard.sort.compare.quick;

import com.gerrard.sort.Sort;

public abstract class BasicQuickSort implements Sort {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int q = partition(array, left, right);
            sort(array, left, q - 1);
            sort(array, q + 1, right);
        }
    }

    protected abstract int partition(int[] array, int left, int right);
}
