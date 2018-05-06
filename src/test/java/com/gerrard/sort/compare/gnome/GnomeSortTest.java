package com.gerrard.sort.compare.gnome;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public class GnomeSortTest extends BasicSortTest {

    private Sort solution = new GnomeSort();

    @Test
    void testGnomeSort() {
        setSolution(solution);
        testSort();
    }

    @Test
    void repeatTestGnomeSort() {
        setSolution(solution);
        repeatSortTest(1000);
    }
}
