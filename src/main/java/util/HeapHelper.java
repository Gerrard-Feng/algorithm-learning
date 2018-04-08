package util;

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

    public static void maxHeapify(int[] array, int i) {
        int l = left(i);
        int r = right(i);
        int largestIndex = i;
        if (l <= array.length && array[l] > array[largestIndex]) {
            largestIndex = l;
        }
        if (r <= array.length && array[r] > array[largestIndex]) {
            largestIndex = r;
        }
        if (i != largestIndex) {
            ArrayHelper.swap(array, i, largestIndex);
            maxHeapify(array, largestIndex);
        }
    }

    public static void buildMaxHeap(int[] array) {
        int lastNonLeaf = (array.length - 2) >>> 1;
        for (int i = lastNonLeaf; i > -1; --i) {
            maxHeapify(array, i);
        }
    }

    public static void minHeapify(int[] array, int i) {
        int l = left(i);
        int r = right(i);
        int smallestIndex = i;
        if (l <= array.length && array[l] < array[smallestIndex]) {
            smallestIndex = l;
        }
        if (r <= array.length && array[r] < array[smallestIndex]) {
            smallestIndex = r;
        }
        if (i != smallestIndex) {
            ArrayHelper.swap(array, i, smallestIndex);
            minHeapify(array, smallestIndex);
        }
    }

    public static void buildMinHeap(int[] array) {
        int lastNonLeaf = (array.length - 2) >>> 1;
        for (int i = lastNonLeaf; i > -1; --i) {
            minHeapify(array, i);
        }
    }
}
