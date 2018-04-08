package util;

import helper.ArrayTestHelper;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
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
        Assert.assertTrue(l == 3);
    }

    @Test
    void testRight() {
        int r = HeapHelper.right(0);
        Assert.assertTrue(r == 2);
    }

    @Test
    void testParent() {
        int p = HeapHelper.parent(4);
        Assert.assertTrue(p == 1);
    }

    @Test
    void testMaxHeapify() {
        HeapHelper.maxHeapify(heapArray, 1);
        ArrayTestHelper.assertArrayEquals(heapArray, new int[]{16, 31, 15, 17, 22, 29, 33});
    }

    @Test
    void testBuildMaxHeap() {
        HeapHelper.buildMaxHeap(heapArray);
        ArrayTestHelper.assertArrayEquals(heapArray, new int[]{33, 31, 29, 17, 22, 16, 15});
    }

    @Test
    void testMinHeapify() {
        HeapHelper.minHeapify(heapArray, 1);
        ArrayTestHelper.assertArrayEquals(heapArray, new int[]{16, 17, 15, 22, 31, 29, 33});
    }

    @Test
    void testBuildMinHeap() {
        HeapHelper.buildMinHeap(heapArray);
        ArrayTestHelper.assertArrayEquals(heapArray, new int[]{33, 31, 29, 17, 22, 16, 15});
    }
}
