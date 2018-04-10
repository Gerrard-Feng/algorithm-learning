package com.gerrard.sort.shell;

import com.gerrard.sort.Sort;

/**
 * Shell-Sort is based on Insertion-Sort, also with complexity O(n^2).
 * First, give a variable: d, usually array.length/2.
 * Consider every d element as an array(means the array is separated into d parts).
 * On every array, use Insertion-Sort.
 * Decrease variable d, usually d/2, do as previous until d=1.
 * <p>
 * Although Shell-Sort doesn't decrease the complexity, its average-complexity is about O(n^1.3),
 * better than other O(n^2)-complexity sort method.
 * <p>
 * Its good average-complexity is based on a feature of Insertion-Sort:
 * Insertion-Sort plays a good performance on mainly-well-ordered array.
 */
public class ShellSort1 implements Sort {

    @Override
    public void sort(int[] array) {
        int d = array.length >>> 1;
        while (d > 0) {
            for (int i = 0; i < d; i++) {
                for (int j = i + d; j < array.length; j += d) {
                    int cur = array[j];
                    boolean flag = false;
                    for (int k = j - d; k > -1; k -= d) {
                        if (cur < array[k]) {
                            array[k + d] = array[k];
                        } else {
                            array[k + d] = cur;
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        array[i] = cur;
                    }
                }
            }
            d >>>= 1;
        }
    }
}
