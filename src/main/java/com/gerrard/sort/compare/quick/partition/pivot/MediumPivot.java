package com.gerrard.sort.compare.quick.partition.pivot;

import com.gerrard.util.RandomHelper;

public final class MediumPivot implements Pivot {

    @Override
    public int getPivotIndex(int[] array, int left, int right) {
        int index1 = RandomHelper.randomBetween(left, right);
        int index2 = RandomHelper.randomBetween(left, right);
        int index3 = RandomHelper.randomBetween(left, right);
        if (array[index1] > array[index2]) {
            if (array[index2] > array[index3]) {
                return index2;
            } else {
                return array[index1] > array[index3] ? index3 : index1;
            }
        } else {
            if (array[index1] > array[index3]) {
                return index3;
            } else {
                return array[index2] > array[index3] ? index3 : index2;
            }
        }
    }
}
