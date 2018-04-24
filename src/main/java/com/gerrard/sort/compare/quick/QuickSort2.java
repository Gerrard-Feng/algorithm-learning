package com.gerrard.sort.compare.quick;

import com.gerrard.util.ArrayHelper;

public class QuickSort2 extends BasicQuickSort {

    @Override
    protected int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left;
        int j = right + 1;
        boolean forward = false;
        while (i < j) {
            while (forward && array[++i] <= pivot && i < j) ;
            while (!forward && array[--j] >= pivot && i < j) ;
            ArrayHelper.swap(array, i, j);
            forward ^= true;
        }
        return j;
    }
}
