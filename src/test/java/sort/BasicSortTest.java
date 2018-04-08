package sort;

import org.junit.Assert;
import helper.ArrayTestHelper;

import java.util.Arrays;

public abstract class BasicSortTest {

    private Sort solution;

    protected void testSort() {
        if (solution == null) {
            Assert.fail("A sort solution must be set first.");
        }
        int[] array1 = ArrayTestHelper.createRandomArray(10, -50, 50);
        int[] array2 = ArrayTestHelper.copyArray(array1);
        Arrays.sort(array1);
        solution.sort(array2);
        ArrayTestHelper.assertArrayEquals(array1, array2);
    }

    protected void setSolution(Sort solution) {
        this.solution = solution;
    }
}
