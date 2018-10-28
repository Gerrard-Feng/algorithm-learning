package com.gerrard.sort.compare.quick;

import com.gerrard.helper.ArrayTestHelper;
import com.gerrard.helper.ComparableTestHelper;
import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import com.gerrard.sort.compare.quick.partition.SandwichPartition;
import com.gerrard.sort.compare.quick.partition.ThreeWayPartition;
import com.gerrard.sort.compare.quick.partition.TwoPointerPartition;
import com.gerrard.sort.compare.quick.partition.pivot.MediumPivot;
import com.gerrard.sort.compare.quick.partition.pivot.Pivot;
import com.gerrard.sort.compare.quick.partition.pivot.RandomPivot;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSortTest extends BasicSortTest {

    private static BasicQuickSort s1, s2, s3, s4, s5, s6, s10;
    private static OptimizedQuickSort s7, s8, s9;

    static {
        Pivot pivotSolution1 = new RandomPivot();
        Pivot pivotSolution2 = new MediumPivot();

        SandwichPartition p1 = new SandwichPartition();
        SandwichPartition p2 = new SandwichPartition();
        p2.setPivotSolution(pivotSolution1);
        SandwichPartition p3 = new SandwichPartition();
        p3.setPivotSolution(pivotSolution2);

        TwoPointerPartition p4 = new TwoPointerPartition();
        TwoPointerPartition p5 = new TwoPointerPartition();
        p5.setPivotSolution(pivotSolution1);
        TwoPointerPartition p6 = new TwoPointerPartition();
        p6.setPivotSolution(pivotSolution2);

        s1 = new QuickSort();
        s1.setPartition(p1);
        s2 = new QuickSort();
        s2.setPartition(p2);
        s3 = new QuickSort();
        s3.setPartition(p3);
        s4 = new QuickSort();
        s4.setPartition(p4);
        s5 = new QuickSort();
        s5.setPartition(p5);
        s6 = new QuickSort();
        s6.setPartition(p6);

        ThreeWayPartition p7 = new ThreeWayPartition();
        p7.setPivotSolution(pivotSolution2);

        s7 = new OptimizedQuickSort();
        s7.setThreshold(0);
        s8 = new OptimizedQuickSort();
        s8.setPartitionSolution(p7);
        s8.setThreshold(0);
        s9 = new OptimizedQuickSort();
        s9.setPartitionSolution(p7);

        s10 = new QuickSortLoop();
    }

    @Test
    void testQuickSort1() {
        setSolution(s1);
        testSort();
    }

    @Test
    void testQuickSort2() {
        setSolution(s2);
        testSort();
    }

    @Test
    void testQuickSort3() {
        setSolution(s3);
        testSort();
    }

    @Test
    void testQuickSort4() {
        setSolution(s4);
        testSort();
    }

    @Test
    void testQuickSort5() {
        setSolution(s5);
        testSort();
    }

    @Test
    void testQuickSort6() {
        setSolution(s6);
        testSort();
    }

    @Test
    void testQuickSort7() {
        setSolution(s7);
        testSort();
    }

    @Test
    void testQuickSort8() {
        setSolution(s8);
        testSort();
    }

    @Test
    void testQuickSort9() {
        setSolution(s9);
        testSort();
    }

    @Test
    void printComparableTestResult() {
        int[] array = ArrayTestHelper.createRandomArray(10000000, 0, 10000000);
        ComparableTestHelper.printCompareResult(array, s1, s4, s7, s10);
    }

}
