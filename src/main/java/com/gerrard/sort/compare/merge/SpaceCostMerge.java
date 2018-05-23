package com.gerrard.sort.compare.merge;

import com.gerrard.util.ArrayHelper;

public final class SpaceCostMerge implements Merge {

    @Override
    public void merge(int[] array, int left, int right) {
        int[] newArray = new int[right - left + 1];
        int mid = ArrayHelper.getMiddle(left, right);
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
