package sort.insertion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import sort.BasicSortTest;
import sort.Sort;

public class InsertionSortTest extends BasicSortTest {

    private Sort solution1 = new InsertionSort1();
    private Sort solution2 = new InsertionSort2();
    private Sort solution3 = new InsertionSort2();
    private Sort solution4 = new InsertionSort2();

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

    @Test
    void test4() {
        setSolution(solution4);
        testSort();
    }
}
