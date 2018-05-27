package com.gerrard.sort.compare.merge;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class MergeSortTest extends BasicSortTest {

    private BasicMergeSort solution1 = new MergeSort();
    private BasicMergeSort solution2 = new MergeSortLoop1();
    private BasicMergeSort solution3 = new MergeSortLoop1();
    private Sort solution4 = new OptimizedMergeSort();

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
    void testMergeSortLoop1WithSpaceCost() {
        solution2.setMerge(new SpaceCostMerge());
        setSolution(solution2);
        testSort();
    }

    @Test
    void testMergeSortLoop2WithTimeCost() {
        solution3.setMerge(new TimeCostMerge());
        setSolution(solution3);
        testSort();
    }

    @Test
    void testOptimizedMergeSort() {
        setSolution(solution4);
        testSort();
    }
}
