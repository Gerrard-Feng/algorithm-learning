package com.gerrard.sort.compare.merge;

import com.gerrard.util.ArrayHelper;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MergeSortLoop extends BasicMergeSort {

    private static final Stack<Record> stack1 = new Stack();
    private static final Stack<Record> stack2 = new Stack();

    @Override
    public void sort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        pushStack(stack1, left, right);
        while (!stack1.isEmpty()) {
            List<Record> records = popAllStack(stack1);
            for (Record record : records) {
                stack2.push(record);
                if (record.left < record.mid) {
                    pushStack(stack1, record.left, record.mid);
                }
                if (record.mid + 1 < record.right) {
                    pushStack(stack1, record.mid + 1, record.right);
                }
            }
        }
        while (!stack2.isEmpty()) {
            Record toBeMerged = stack2.pop();
            mergeSolution.merge(array, toBeMerged.left, toBeMerged.right);
        }
    }


    private List<Record> popAllStack(Stack<Record> stack) {
        List<Record> list = new LinkedList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    private void pushStack(Stack<Record> stack, int left, int right) {
        Record record = new Record(left, ArrayHelper.getMiddle(left, right), right);
        stack.push(record);
    }

    private static class Record {
        int left;
        int mid;
        int right;

        private Record(int left, int mid, int right) {
            this.left = left;
            this.mid = mid;
            this.right = right;
        }
    }
}
