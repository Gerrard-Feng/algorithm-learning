package com.gerrard.sort;

import com.gerrard.helper.ArrayTestHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

public abstract class BasicSortTest {

    private Sort solution;

    @BeforeEach
    void assertSolutionNull() {
        Assertions.assertTrue(solution == null);
    }

    @AfterEach
    void destroySolution() {
        setSolution(null);
    }

    protected void testSort() {
        if (solution == null) {
            Assertions.fail("A sort solution must be set first.");
        }
        int[] array1 = ArrayTestHelper.createRandomArray(10, -50, 50);
        int[] array2 = ArrayTestHelper.copyArray(array1);
        Arrays.sort(array1);
        solution.sort(array2);
        Assertions.assertArrayEquals(array1, array2);
    }

    protected void setSolution(Sort solution) {
        this.solution = solution;
    }
}
