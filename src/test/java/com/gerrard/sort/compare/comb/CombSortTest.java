package com.gerrard.sort.compare.comb;

import com.gerrard.sort.BasicSortTest;
import org.junit.jupiter.api.Test;

public class CombSortTest extends BasicSortTest {

    private CombSort solution = new CombSort();

    @Test
    void testCombSort() {
        setSolution(solution);
        testSort();
    }

    @Test
    void repeatTestCombSort() {
        setSolution(solution);
        repeatSortTest(1000);
    }

    @Test
    void typicalTest() {
        solution.setShrink(10);
        setSolution(solution);
        int[] testArray = {5, 7, 3, 6, 9, 2, 1, 4, 0, 8};
        testTypicalArraySort(testArray);
    }
}
