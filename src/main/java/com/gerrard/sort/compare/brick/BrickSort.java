package com.gerrard.sort.compare.brick;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;

/**
 * Brick-Sort(also called Odd-Even-Sort or Odd-Even-Transposition-Sort).
 * Brick-Sort is a variation of Bubble-Sort, with complexity O(n^2).
 * Brick-Sort is designed for parallel processors with local interconnections.
 * <p>
 * It compares all odd/even indexed pairs of adjacent elements in the array, once in wrong order, then exchange.
 * Since it compares with neighbor inner the circulation, the current circulation is no relation to next,
 * it can be put into different processor.
 */
public class BrickSort implements Sort {

    @Override
    public void sort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    ArrayHelper.swap(array, i, i + 1);
                    sorted = false;
                }
            }
            for (int i = 1; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    ArrayHelper.swap(array, i, i + 1);
                    sorted = false;
                }
            }
        }
    }
}
