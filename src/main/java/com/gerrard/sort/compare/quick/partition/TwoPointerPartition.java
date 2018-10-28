package com.gerrard.sort.compare.quick.partition;

import com.gerrard.sort.compare.quick.partition.pivot.Pivot;
import com.gerrard.util.ArrayHelper;

/**
 * This partition solution works from left to right, with complexity O(n).
 *
 * Step1: Select the right one as pivot.
 * Step2: Define two index, the slower and the faster.
 * Step3: Use faster to iterator array, use slower to mark numbers not larger than pivot, slower initial as left-1.
 * Step4: When iterator array, if meet slower one, slower+1 and swap faster and slower one.
 * (It means the way slower works is always not larger than pivot)
 * Step5: Iterator end the numbers on and before slower are all not larger, then slower+1 and swap pivot and slower one.
 * (The pivot does not contain in iterator, so never IndexOytOfBound here)
 */
public final class TwoPointerPartition implements Partition {

    private Pivot pivotSolution;

    public void setPivotSolution(Pivot pivotSolution) {
        this.pivotSolution = pivotSolution;
    }

    @Override
    public int partition(int[] array, int left, int right) {
        if (pivotSolution != null) {
            int newPivot = pivotSolution.getPivotIndex(array, left, right);
            ArrayHelper.swap(array, right, newPivot);
        }
        int pivot = array[right];
        int slower = left - 1;
        for (int faster = left; faster < right; ++faster) {
            if (array[faster] <= pivot) {
                slower++;
                ArrayHelper.swap(array, slower, faster);
            }
        }
        ArrayHelper.swap(array, slower + 1, right);
        return slower + 1;
    }
}
