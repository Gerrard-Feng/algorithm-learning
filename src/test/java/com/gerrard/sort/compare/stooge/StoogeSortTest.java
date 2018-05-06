package com.gerrard.sort.compare.stooge;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class StoogeSortTest extends BasicSortTest {

    private Sort solution = new StoogeSort();

    @Test
    void testStoogeSort() {
        setSolution(solution);
        testSort();
    }

    @Test
    void repeatTestStoogeSort() {
        setSolution(solution);
        repeatSortTest(1000);
    }

    @Test
    void typicalTestStoogeSort() {
        setSolution(solution);
        int[] testArray = {5, 7, 3, 6, 9, 2, 1, 4, 0, 8};
        testTypicalArraySort(testArray);
    }
}