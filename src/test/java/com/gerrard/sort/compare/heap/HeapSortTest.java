package com.gerrard.sort.compare.heap;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public final class HeapSortTest extends BasicSortTest {

    private Sort solution1 = new HeapSort1();

    @Test
    void test1() {
        setSolution(solution1);
        testSort();
    }
}
