package com.gerrard.sort.compare.merge;

public final class MergeSortLoop2 extends BasicMergeSortLoop {

    @Override
    protected void buildTargetStack() {
        while (!sourceStack.isEmpty()) {
            Record record = sourceStack.pop();
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
