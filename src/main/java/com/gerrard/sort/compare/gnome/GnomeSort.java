package com.gerrard.sort.compare.gnome;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * Gnome-Sort can be regarded as a variation of Insertion-Sort, with complexity O(n^2).
 * The difference is that moving an element to its proper place is accomplished by a series of swaps, as in bubble sort.
 */
public class GnomeSort implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            gnomeSort(array, i);
        }
    }

    private void gnomeSort(int[] array, int upperBound) {
        int pos = upperBound;
        while (pos > 0 && array[pos] < array[pos - 1]) {
            ArrayHelper.swap(array, pos, pos - 1);
            pos--;
        }
    }
}
