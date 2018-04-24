package com.gerrard.sort.compare.merge;

/**
 * Another Merge-Sort solution, with only O(1) space cost.
 * It use Insertion-Sort solution to merge two ordered array.
 * In this solution, the complexity will not be O(n*lgn), but increase to O(n^2).
 */
public final class MergeSort2 extends BasicMergeSort {

    @Override
    protected void merge(int[] array, int left, int mid, int right) {
        for (int i = mid + 1; i <= right; ++i) {
            int cur = array[i];
            boolean flag = false;
            for (int j = i - 1; j >= left; --j) {
                if (cur < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    array[j + 1] = cur;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                array[left] = cur;
            }
        }
    }
}
