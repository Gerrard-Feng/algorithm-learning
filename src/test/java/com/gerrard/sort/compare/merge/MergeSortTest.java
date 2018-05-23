package com.gerrard.sort.compare.merge;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class MergeSortTest extends BasicSortTest {

    private BasicMergeSort solution1 = new MergeSort();
    private BasicMergeSort solution2 = new MergeSortLoop();
    private Sort solution3 = new OptimizedMergeSort();

    @Test
    void testMergeSortWithSpaceCost() {
        solution1.setMerge(new SpaceCostMerge());
        setSolution(solution1);
        testSort();
    }

    @Test
    void testMergeSortWithTimeCost() {
        solution1.setMerge(new TimeCostMerge());
        setSolution(solution1);
        testSort();
    }

    @Test
    void testMergeSortLoopWithSpaceCost() {
        solution2.setMerge(new SpaceCostMerge());
        setSolution(solution2);
        testSort();
    }

    @Test
    void testMergeSortLoopWithTimeCost() {
        solution2.setMerge(new TimeCostMerge());
        setSolution(solution2);
        testSort();
    }

    @Test
    void testOptimizedMergeSort() {
        setSolution(solution3);
        testSort();
    }
}
