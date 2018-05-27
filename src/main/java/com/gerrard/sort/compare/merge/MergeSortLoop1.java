package com.gerrard.sort.compare.merge;

import java.util.Stack;

public final class MergeSortLoop1 extends BasicMergeSortLoop {

    private static final Stack<Record> transferStack = new Stack();

    @Override
    protected void buildTargetStack() {
        while (!sourceStack.isEmpty()) {
            popAll(sourceStack, transferStack);
            while (!transferStack.isEmpty()) {
                Record record = transferStack.pop();
                targetStack.push(record);
                if (record.left < record.mid) {
                    pushStack(targetStack, record.left, record.mid);
                }
                if (record.mid + 1 < record.right) {
                    pushStack(targetStack, record.mid + 1, record.right);
                }
            }
        }
    }

    private void popAll(Stack<Record> source, Stack<Record> target) {
        while (!source.isEmpty()) {
            target.push(source.pop());
        }
    }
}
