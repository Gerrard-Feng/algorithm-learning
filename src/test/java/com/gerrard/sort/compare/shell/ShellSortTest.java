package com.gerrard.sort.compare.shell;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public class ShellSortTest extends BasicSortTest {

    private Sort solution1 = new ShellSort1();

    @Test
    void test1() {
        setSolution(solution1);
        testSort();
    }
}
