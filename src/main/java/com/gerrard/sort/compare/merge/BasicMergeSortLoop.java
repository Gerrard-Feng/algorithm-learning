package com.gerrard.sort.compare.merge;

import com.gerrard.util.ArrayHelper;

import java.util.Stack;

public abstract class BasicMergeSortLoop extends BasicMergeSort {

    protected static final Stack<Record> sourceStack = new Stack();
    protected static final Stack<Record> targetStack = new Stack();

    @Override
    public void sort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        pushStack(sourceStack, left, right);
        buildTargetStack();
        while (!targetStack.isEmpty()) {
            Record toBeMerged = targetStack.pop();
            mergeSolution.merge(array, toBeMerged.left, toBeMerged.right);
        }
    }

    protected void pushStack(Stack<Record> stack, int left, int right) {
        Record record = new Record(left, ArrayHelper.getMiddle(left, right), right);
        stack.push(record);
    }

    protected abstract void buildTargetStack();

    protected static class Record {
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
