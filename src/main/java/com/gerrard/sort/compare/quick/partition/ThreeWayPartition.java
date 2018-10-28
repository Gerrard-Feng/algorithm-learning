package com.gerrard.sort.compare.quick.partition;

import com.gerrard.sort.compare.quick.partition.pivot.Pivot;
import com.gerrard.util.ArrayHelper;

/**
 * Three-Way-partition is an optimized solution for partition, also with complexity O(n).
 * It directly separate the original array into three parts: smaller than pivot, equal to pivot, larger than pivot.
 * It extends {@link SandwichPartition} solution.
 *
 * Step1: Select the left one as pivot.
 * Step2: Besides i and j, define two more index p and q as two sides index.
 * Step3: Work as SandwichPartition, from sides->middle, the only difference is:
 *        when meeting equal to pivot scenario, swap i and p or j and q.
 *
 * Step4: After iterator ends, the array should look like:
 *
 *        left                   i=j                     right
 *        ---------------------------------------------------
 *        |     |           |     |     |               |   |
 *        ---------------------------------------------------
 *              p           p'          q'              q
 *
 *        The distance between left->p and p'->i should be same.
 *        The distance between j->q' and q->right should also be same.
 *        [left,p) and (q,right] is equal to pivot, [p,i) is smaller than pivot, (j,q] is larger than pivot.
 *
 * Step5: Exchange [left,p) and [p',i), exchange (q,right] and (j,q'].
 * Step6: Returns two number p'-1 and q'+1.
 *
 */
public final class ThreeWayPartition {

    private Pivot pivotSolution;

    public void setPivotSolution(Pivot pivotSolution) {
        this.pivotSolution = pivotSolution;
    }

    public int[] partition(int[] array, int left, int right) {
        if (pivotSolution != null) {
            int newPivot = pivotSolution.getPivotIndex(array, left, right);
            ArrayHelper.swap(array, left, newPivot);
        }
        int pivot = array[left];
        int i = left;
        int j = right + 1;
        int p = i;
        int q = j - 1;
        boolean forward = false;
        while (i < j) {
            while (forward && array[++i] <= pivot && i < j) {
                if (array[i] == pivot) {
                    ArrayHelper.swap(array, i, p++);
                }
            }
            while (!forward && array[--j] >= pivot && i < j) {
                if (array[j] == pivot) {
                    ArrayHelper.swap(array, j, q--);
                }
            }
            ArrayHelper.swap(array, i, j);
            forward ^= true;
        }
        while (p > left) {
            ArrayHelper.swap(array, --p, --i);
        }
        while (q < right) {
            ArrayHelper.swap(array, ++q, ++j);
        }
        return new int[]{i, j};
    }
}
