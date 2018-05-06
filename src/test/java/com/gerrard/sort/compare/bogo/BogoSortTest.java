package com.gerrard.sort.compare.bogo;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class BogoSortTest extends BasicSortTest {

    private Sort solution = new BogoSort();

    @Test
    void testBogoSort() {
        setSolution(solution);
        testSort(10, 0, 10);
    }
}