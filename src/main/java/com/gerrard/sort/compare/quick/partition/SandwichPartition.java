package com.gerrard.sort.compare.quick.partition;

import com.gerrard.sort.compare.quick.partition.pivot.Pivot;
import com.gerrard.util.ArrayHelper;

/**
 * This partition solution works from both sides to middle, with complexity O(n).
 *
 * Step1: Select the left one as pivot.
 * Step2: From the left side, find first one larger then pivot, swap pivot and this number.
 * Step3: From the right side, find first one smaller then pivot, swap pivot and this number.
 * Step4: Repeated execute step2 and step3, until the index meet at middle.
 * Step5: Return middle index(Currently pivot number is in this index).
 */
public final class SandwichPartition implements Partition {

    private Pivot pivotSolution;

    public void setPivotSolution(Pivot pivotSolution) {
        this.pivotSolution = pivotSolution;
    }

    @Override
    public int partition(int[] array, int left, int right) {
        if (pivotSolution != null) {
            int newPivot = pivotSolution.getPivotIndex(array, left, right);
            ArrayHelper.swap(array, left, newPivot);
        }
        int pivot = array[left];
        int i = left;
        int j = right + 1;
        boolean forward = false;
        while (i < j) {
            while (forward && array[++i] <= pivot && i < j) ;
            while (!forward && array[--j] >= pivot && i < j) ;
            ArrayHelper.swap(array, i, j);
            forward ^= true;
        }
        return j;
    }
}
