package com.gerrard.sort.compare.heap;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;
import com.gerrard.util.HeapHelper;

/**
 * Heap-Sort is based on the feature of data structure: heap, with complexity O(n*lgn).
 * First, build target array as a max-heap.
 * Secondly, swap first node and last node of heap-array(first node is always the largest).
 * Then, regard 1-array.length-1 as a new heap-array, maintains its max-heap feature.
 * Repeat until first node, then the whole array is ordered.
 */
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
