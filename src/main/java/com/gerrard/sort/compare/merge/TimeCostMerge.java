package com.gerrard.sort.compare.merge;

import com.gerrard.util.ArrayHelper;

public class TimeCostMerge implements Merge {

    @Override
    public void merge(int[] array, int left, int right) {
        int mid = ArrayHelper.getMiddle(left, right);
        for (int i = mid + 1; i <= right; ++i) {
            int cur = array[i];
            boolean flag = false;
            for (int j = i - 1; j >= left; --j) {
                if (cur < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    array[j + 1] = cur;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                array[left] = cur;
            }
        }
    }
}
