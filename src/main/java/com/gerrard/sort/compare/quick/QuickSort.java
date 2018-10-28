package com.gerrard.sort.compare.quick;

public final class QuickSort extends BasicQuickSort {

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int q = partitionSolution.partition(array, left, right);
            sort(array, left, q - 1);
            sort(array, q + 1, right);
        }
    }
}
