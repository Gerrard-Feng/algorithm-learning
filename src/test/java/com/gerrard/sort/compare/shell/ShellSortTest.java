package com.gerrard.sort.compare.shell;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public class ShellSortTest extends BasicSortTest {

    private Sort solution = new ShellSort();

    @Test
    void testShellSort() {
        setSolution(solution);
        testSort();
    }

    @Test
    void repeatTestShellSort() {
        setSolution(solution);
        repeatSortTest(1000);
    }

    @Test
    void typicalTest() {
        setSolution(solution);
        int[] testArray = {73, 72, 93, 44, 15, 70, 67, 58, 64, 69};
        testTypicalArraySort(testArray);
    }
}
