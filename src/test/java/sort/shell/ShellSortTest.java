package sort.shell;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import sort.BasicSortTest;
import sort.Sort;

public class ShellSortTest extends BasicSortTest {

    private Sort solution1 = new ShellSort1();

    @AfterEach
    void destroySolution() {
        setSolution(null);
    }

    @Test
    void test1() {
        setSolution(solution1);
        testSort();
    }
}
