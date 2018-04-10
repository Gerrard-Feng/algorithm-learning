package com.gerrard.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HeapHelperTest {

    /*        16
     *    22      15
     *  17  31  29  33
     */
    private int[] heapArray = {16, 22, 15, 17, 31, 29, 33};

    @AfterEach
    void recoverArray() {
        this.heapArray = new int[]{16, 22, 15, 17, 31, 29, 33};
    }

    @Test
    void testLeft() {
        int l = HeapHelper.left(1);
        Assertions.assertTrue(l == 3);
    }

    @Test
    void testRight() {
        int r = HeapHelper.right(0);
        Assertions.assertTrue(r == 2);
    }

    @Test
    void testParent() {
        int p = HeapHelper.parent(4);
        Assertions.assertTrue(p == 1);
    }

    @Test
    void testMaxHeapify1() {
        int[] newArray = {16, 31, 33, 17, 22, 29, 15};
        HeapHelper.maxHeapify(newArray, 0, 4);
        Assertions.assertArrayEquals(newArray, new int[]{33, 31, 16, 17, 22, 29, 15});
    }

    @Test
    void testMaxHeapify2() {
        HeapHelper.maxHeapify(heapArray, 1);
        Assertions.assertArrayEquals(heapArray, new int[]{16, 31, 15, 17, 22, 29, 33});
    }

    @Test
    void testBuildMaxHeap() {
        HeapHelper.buildMaxHeap(heapArray);
        Assertions.assertArrayEquals(heapArray, new int[]{33, 31, 29, 17, 22, 16, 15});
    }

    @Test
    void testMinHeapify1() {
        int[] newArray = {30, 17, 15, 22, 31, 29, 33};
        HeapHelper.minHeapify(newArray, 0, 4);
        Assertions.assertArrayEquals(newArray, new int[]{15, 17, 30, 22, 31, 29, 33});
    }

    @Test
    void testMinHeapify2() {
        HeapHelper.minHeapify(heapArray, 1);
        Assertions.assertArrayEquals(heapArray, new int[]{16, 17, 15, 22, 31, 29, 33});
    }

    @Test
    void testBuildMinHeap() {
        HeapHelper.buildMinHeap(heapArray);
        Assertions.assertArrayEquals(heapArray, new int[]{15, 17, 16, 22, 31, 29, 33});
    }
}
