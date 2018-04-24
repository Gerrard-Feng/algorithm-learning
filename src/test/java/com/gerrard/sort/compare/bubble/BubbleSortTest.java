package com.gerrard.sort.compare.bubble;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class BubbleSortTest extends BasicSortTest {

    private Sort solution1 = new BubbleSort1();
    private Sort solution2 = new BubbleSort1();
    private Sort solution3 = new BubbleSort1();

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

    @Test
    void test3() {
        setSolution(solution3);
        testSort();
    }
}
