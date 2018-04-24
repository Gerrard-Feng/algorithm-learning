package com.gerrard.sort.compare.merge;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class MergeSortTest extends BasicSortTest {

    private Sort solution1 = new MergeSort1();
    private Sort solution2 = new MergeSort2();
    private MixedMergeSort solution3 = new MixedMergeSort();

    @Test
    void testMergeSort1() {
        setSolution(solution1);
        testSort();
    }

    @Test
    void testMergeSort2() {
        setSolution(solution2);
        testSort();
    }

    @Test
    void testMixedMergeSort() {
        solution3.setThreshold(64);
        setSolution(solution3);
        testSort();
    }
}
