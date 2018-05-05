package com.gerrard.sort.compare.brick;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public class BrickSortTest extends BasicSortTest {

    private Sort solution = new BrickSort();

    @Test
    void testBrickSort() {
        setSolution(solution);
        testSort();
    }

    @Test
    void testRepeatBrickSort() {
        setSolution(solution);
        repeatSortTest(1000);
    }

    @Test
    void typicalTest() {
        setSolution(solution);
        int[] testArray = {5, 7, 3, 6, 9, 2, 1, 4, 0, 8};
        testTypicalArraySort(testArray);
    }
}
