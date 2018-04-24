package com.gerrard.sort.compare.merge;

/**
 * This is a common Merge-Sort solution.
 * Every time merge two ordered array, a new space for array will be cost.
 * So the O(n*lgn) complexity is based on O(n) space cost.
 */
public final class MergeSort1 extends BasicMergeSort {

    @Override
    protected void merge(int[] array, int left, int mid, int right) {
        int[] newArray = new int[right - left + 1];
        int startIndex1 = left;
        int startIndex2 = mid + 1;
        for (int i = 0; i < newArray.length; ++i) {
            if (startIndex1 == mid + 1) {
                newArray[i] = array[startIndex2++];
            } else if (startIndex2 == right + 1) {
                newArray[i] = array[startIndex1++];
            } else {
                newArray[i] = array[startIndex1] < array[startIndex2] ? array[startIndex1++] : array[startIndex2++];
            }
        }
        System.arraycopy(newArray, 0, array, left, newArray.length);
    }
}
