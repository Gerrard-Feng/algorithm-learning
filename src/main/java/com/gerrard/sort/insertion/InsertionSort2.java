package com.gerrard.sort.insertion;

import com.gerrard.sort.Sort;

/**
 * A optimization schema for basic insertion sort.
 * Record number and index in last loop, and compare the number with current one.
 * If current is larger, work as basic insertion sort.
 * Else move the numbers between last index and current index, and find from last index.
 */
public class InsertionSort2 implements Sort {

    @Override
    public void sort(int[] array) {
        int checkIndex = 0;
        int checkNumber = array[0];
        for (int i = 1; i < array.length; ++i) {
            int cur = array[i];
            int startIndex = i - 1;
            if (cur < checkNumber) {
                startIndex = checkIndex;
                for (int j = i - 1; j > startIndex; j--) {
                    array[j + 1] = array[j];
                }
            }
            boolean flag = false;
            for (int j = startIndex; j > -1; j--) {
                if (cur < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    array[j + 1] = cur;
                    checkIndex = j + 1;
                    checkNumber = cur;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                checkIndex = 0;
                checkNumber = cur;
                array[0] = cur;
            }
        }
    }
}
