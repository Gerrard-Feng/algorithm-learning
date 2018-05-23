package com.gerrard.sort.compare.merge;

import com.gerrard.sort.Sort;

public abstract class BasicMergeSort implements Sort {

    /**
     * Merge solution, default use space-cost merge.
     */
    protected Merge mergeSolution = new SpaceCostMerge();

    public Merge getMerge() {
        return mergeSolution;
    }

    public void setMerge(Merge mergeSolution) {
        this.mergeSolution = mergeSolution;
    }
}
