package com.gerrard.sort.insertion;

import com.gerrard.sort.Sort;

/**
 * Most common insertion sort(sometimes called straight insertion sort), with complexity O(n^2).
 * First, regard the first element as one-length-ordered array, then insert the second element into the ordered array.
 * Similarly, insert the remaining elements into the n-length-ordered array one by one, until the last element.
 * One thing to be considered is that the element maybe the smallest, so a flag is used.
 */
public class InsertionSort1 implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int cur = array[i];
            boolean flag = false;
            for (int j = i - 1; j > -1; --j) {
                if (cur < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    array[j + 1] = cur;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                array[0] = cur;
            }
        }
    }
}
