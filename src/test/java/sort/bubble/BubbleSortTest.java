package sort.bubble;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import sort.BasicSortTest;
import sort.Sort;

public final class BubbleSortTest extends BasicSortTest {

    private Sort solution1 = new BubbleSort1();
    private Sort solution2 = new BubbleSort1();
    private Sort solution3 = new BubbleSort1();

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

    @Test
    void test3() {
        setSolution(solution3);
        testSort();
    }
}
