package com.gerrard.sort.compare.quick.partition.pivot;

import com.gerrard.util.RandomHelper;

public final class RandomPivot implements Pivot {

    @Override
    public int getPivotIndex(int[] array, int left, int right) {
        return RandomHelper.randomBetween(left, right);
    }
}
