package sort.selection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import sort.BasicSortTest;
import sort.Sort;

public final class SelectionSortTest extends BasicSortTest {

    private Sort solution1 = new SelectionSort1();
    private Sort solution2 = new SelectionSort2();

    @AfterEach
    void destroySolution() {
        setSolution(null);
    }

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
