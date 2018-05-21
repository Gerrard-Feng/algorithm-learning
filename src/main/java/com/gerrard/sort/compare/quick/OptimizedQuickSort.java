package com.gerrard.sort.compare.quick;

import com.gerrard.sort.Sort;

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
}
