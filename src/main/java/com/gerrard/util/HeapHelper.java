package com.gerrard.util;

public final class HeapHelper {

    private HeapHelper() {

    }

    public static int left(int i) {
        return (i << 1) + 1;
    }

    public static int right(int i) {
        return (i << 1) + 2;
    }

    public static int parent(int i) {
        return (i - 1) >>> 1;
    }

    public static void maxHeapify(int[] array, int rootIndex) {
        maxHeapify(array, rootIndex, array.length - 1);
    }

    /**
     * The function aims at maintain the feature of max heap.
     * But left(rootIndex) and right(rootIndex) should both have feature of max heap first.
     *
     * @param array     heap array
     * @param rootIndex root index of heap
     * @param lastIndex last index of heap
     */
    public static void maxHeapify(int[] array, int rootIndex, int lastIndex) {
        int l = left(rootIndex);
        int r = right(rootIndex);
        int largestIndex = rootIndex;
        if (l <= lastIndex && array[l] > array[largestIndex]) {
            largestIndex = l;
        }
        if (r <= lastIndex && array[r] > array[largestIndex]) {
            largestIndex = r;
        }
        if (rootIndex != largestIndex) {
            ArrayHelper.swap(array, rootIndex, largestIndex);
            maxHeapify(array, largestIndex, lastIndex);
        }
    }

    public static void buildMaxHeap(int[] array) {
        int lastNonLeaf = (array.length - 2) >>> 1;
        for (int i = lastNonLeaf; i > -1; --i) {
            maxHeapify(array, i);
        }
    }

    public static void minHeapify(int[] array, int rootIndex) {
        minHeapify(array, rootIndex, array.length - 1);
    }

    /**
     * The function aims at maintain the feature of min heap.
     * But left(rootIndex) and right(rootIndex) should both have feature of min heap first.
     *
     * @param array     heap array
     * @param rootIndex root index of heap
     * @param lastIndex last index of heap
     */
    public static void minHeapify(int[] array, int rootIndex, int lastIndex) {
        int l = left(rootIndex);
        int r = right(rootIndex);
        int smallestIndex = rootIndex;
        if (l <= lastIndex && array[l] < array[smallestIndex]) {
            smallestIndex = l;
        }
        if (r <= lastIndex && array[r] < array[smallestIndex]) {
            smallestIndex = r;
        }
        if (rootIndex != smallestIndex) {
            ArrayHelper.swap(array, rootIndex, smallestIndex);
            minHeapify(array, smallestIndex, lastIndex);
        }
    }

    public static void buildMinHeap(int[] array) {
        int lastNonLeaf = (array.length - 2) >>> 1;
        for (int i = lastNonLeaf; i > -1; --i) {
            minHeapify(array, i);
        }
    }
}
