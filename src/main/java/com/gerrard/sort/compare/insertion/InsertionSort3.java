package com.gerrard.sort.compare.insertion;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

import java.util.Arrays;

/**
 * Binary Search can directly find the position of element waiting to be inserted.
 * But it breaks the stability of insertion sort.
 * <p>
 * The JDK provides a method to do it.
 * However, it contains array reconstruction.
 */
public class InsertionSort3 implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int cur = array[i];
            int[] sorted = Arrays.copyOf(array, i);
            int index = Arrays.binarySearch(sorted, cur);
            if (index < 0) {
                index = -(index + 1);
            }
            ArrayHelper.moveBySteps(array, index, i - 1, true, 1);
            array[index] = cur;
        }
    }
}
