package com.gerrard.sort.compare.quick.partition;

/**
 * partition aims at separate the origin array into two parts.
 * It returns an index, as pivot.
 * On the left side of the index, all numbers are not larger than the pivot.
 * On the right side of the index, all numbers are not smaller than the pivot.
 */
public interface Partition {

    int partition(int[] array, int left, int right);
}
