package sort.bubble;

import sort.Sort;
import util.ArrayHelper;

/**
 * A optimization schema for basic bubble sort.
 * Use a 'sentry' flag to monitor if there is any exchange in last inner-loop.
 * If not, finish the outside-loop directly, because the whole array has already been ordered.
 */
public final class BubbleSort2 implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            boolean hasSwap = false;
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    ArrayHelper.swap(array, j, j + 1);
                    hasSwap = true;
                }
            }
            if (!hasSwap) {
                break;
            }
        }
    }
}
