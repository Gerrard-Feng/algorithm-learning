package com.gerrard.sort.selection;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class SelectionSortTest extends BasicSortTest {

    private Sort solution1 = new SelectionSort1();
    private Sort solution2 = new SelectionSort2();

    @Test
    void test1() {
        setSolution(solution1);
        testSort();
    }

    @Test
    void test2() {
        setSolution(solution2);
        testSort();
    }
}
