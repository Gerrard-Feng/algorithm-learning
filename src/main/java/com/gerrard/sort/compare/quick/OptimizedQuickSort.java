package com.gerrard.sort.compare.quick;

import com.gerrard.sort.Sort;
import com.gerrard.util.ArrayHelper;
import com.gerrard.util.RandomHelper;

public class OptimizedQuickSort implements Sort {

    private int threshold = 2 << 4;

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int left, int right) {
        if (right - left < threshold) {
            insertionSort(array, left, right);
        } else if (left < right) {
            ArrayHelper.swap(array, left, getPivotIndex(array, left, right));
            int[] partitions = threeWayPartition(array, left, right);
            sort(array, left, partitions[0] - 1);
            sort(array, partitions[1] + 1, right);
        }
    }

    private void insertionSort(int[] array, int startIndex, int endIndex) {
        for (int i = startIndex + 1; i <= endIndex; ++i) {
            int cur = array[i];
            boolean flag = false;
            for (int j = i - 1; j > -1; --j) {
                if (cur < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    array[j + 1] = cur;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                array[0] = cur;
            }
        }
    }

    private int getPivotIndex(int[] array, int left, int right) {
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

    private int[] threeWayPartition(int[] array, int left, int right) {
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