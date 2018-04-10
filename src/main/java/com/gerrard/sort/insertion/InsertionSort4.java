package com.gerrard.sort.insertion;

import com.gerrard.sort.Sort;

/**
 * A more efficient solution than InsertionSort3, without array reconstruction.
 * It also breaks sort stability, and less efficient than Shell Sort.
 */
public class InsertionSort4 implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int cur = array[i];
            int low = 0, high = i - 1;
            int index = binarySearch(array, low, high, cur);
            for (int j = i - 1; j > index - 1; j--) {
                array[j + 1] = array[j];
            }
            array[index] = cur;
        }
    }

    private int binarySearch(int[] array, int low, int high, int cur) {
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int mVal = array[mid];
            if (mVal < cur) {
                low = mid + 1;
            } else if (mVal > cur) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }
}
