package com.gerrard.sort.compare.bubble;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * A more efficient solution than BubbleSort2.
 * Record the last swap position, instead of a 'sentry' flag.
 * <p>
 * Every time swap happens, use a temp variable 'lastSwapPosTemp' to record the position.
 * Before every inner-loop, update the last swap position 'lastSwapPos' as 'lastSwapPosTemp'.
 * So, after every inner-loop, judge if the two variables are equal.(It works as 'sentry' flag)
 * <p>
 * Besides that, 'lastSwapPos' can work as the destination of inner-loop.
 * Because we can image that if the last swap happens somewhere(not the end of inner-loop),
 * then the remaining part is already ordered.
 */
public final class BubbleSort3 implements Sort {

    @Override
    public void sort(int[] array) {
        int lasSwapPos;
        int lastSwapPosTemp = array.length - 1;
        for (int i = 0; i < array.length - 1; ++i) {
            lasSwapPos = lastSwapPosTemp;
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    ArrayHelper.swap(array, j, j + 1);
                    lastSwapPosTemp = j;
                }
            }
            if (lasSwapPos == lastSwapPosTemp) {
                break;
            }
        }
    }
}
