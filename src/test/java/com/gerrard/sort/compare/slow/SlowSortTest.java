package com.gerrard.sort.compare.slow;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class SlowSortTest extends BasicSortTest {

    private Sort solution = new SlowSort();

    @Test
    void testSlowSort() {
        setSolution(solution);
        testSort();
    }

    @Test
    void repeatTestSlowSort() {
        setSolution(solution);
        repeatSortTest(1000);
    }

    @Test
    void typicalTestSlowSort() {
        setSolution(solution);
        int[] testArray = {5, 7, 3, 6, 9, 2, 1, 4, 0, 8};
        testTypicalArraySort(testArray);
    }
}