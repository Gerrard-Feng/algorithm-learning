package com.gerrard.sort.heap;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;
import com.gerrard.util.HeapHelper;

public final class HeapSort1 implements Sort {

    @Override
    public void sort(int[] array) {
        HeapHelper.buildMaxHeap(array);
        for (int i = array.length - 1; i > 0; --i) {
            ArrayHelper.swap(array, i, 0);
            HeapHelper.maxHeapify(array, 0, i - 1);
        }
    }
}
