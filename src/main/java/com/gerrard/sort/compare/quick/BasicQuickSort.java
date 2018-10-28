package com.gerrard.sort.compare.quick;

import com.gerrard.sort.Sort;
import com.gerrard.sort.compare.quick.partition.Partition;
import com.gerrard.sort.compare.quick.partition.SandwichPartition;

public abstract class BasicQuickSort implements Sort {

    protected Partition partitionSolution = new SandwichPartition();

    public void setPartition(Partition partitionSolution) {
        this.partitionSolution = partitionSolution;
    }
}
