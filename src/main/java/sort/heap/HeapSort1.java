package sort.heap;

import sort.Sort;
import util.HeapHelper;

public final class HeapSort1 implements Sort {

    @Override
    public void sort(int[] array) {
        HeapHelper.buildMaxHeap(array);

    }
}
