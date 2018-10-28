package com.gerrard.sort.compare.quick;

import java.util.ArrayDeque;
import java.util.Deque;

public final class QuickSortLoop extends BasicQuickSort {

    private Deque<Record> stack = new ArrayDeque<>();

    @Override
    public void sort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        if (left < right) {
            int pivot = partitionSolution.partition(array, left, right);
            if (pivot - 1 >= left) {
                stack.push(new Record(left, pivot - 1));
            }
            if (pivot + 1 <= right) {
                stack.push(new Record(pivot + 1, right));
            }
            while (!stack.isEmpty()) {
                Record record = stack.pop();
                pivot = partitionSolution.partition(array, record.left, record.right);
                if (pivot - 1 >= record.left) {
                    stack.push(new Record(record.left, pivot - 1));
                }
                if (pivot + 1 <= record.right) {
                    stack.push(new Record(pivot + 1, record.right));
                }
            }
        }
    }

    private static class Record {
        int left;
        int right;

        private Record(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}
