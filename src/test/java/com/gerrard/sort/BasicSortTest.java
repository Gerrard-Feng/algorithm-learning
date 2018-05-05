package com.gerrard.sort;

import com.gerrard.helper.ArrayTestHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

public abstract class BasicSortTest {

    private Sort solution;

    private static final int DEFAULT_ARRAY_LENGTH = 50;
    private static final int DEFAULT_ELEMENT_MIN = 0;
    private static final int DEFAULT_ELEMENT_MAX = 100;

    @BeforeEach
    void assertSolutionNull() {
        Assertions.assertTrue(solution == null);
    }

    @AfterEach
    void destroySolution() {
        setSolution(null);
    }

    protected void testSort() {
        testSort(DEFAULT_ARRAY_LENGTH, DEFAULT_ELEMENT_MIN, DEFAULT_ELEMENT_MAX);
    }

    protected void testSort(int arrayLength, int minElement, int maxElement) {
        int[] array = ArrayTestHelper.createRandomArray(arrayLength, minElement, maxElement);
        testTypicalArraySort(array);
    }

    protected void testTypicalArraySort(int[] array) {
        assertSolutionSet();
        int[] checkArray = ArrayTestHelper.copyArray(array);
        Arrays.sort(checkArray);
        solution.sort(array);
        Assertions.assertArrayEquals(array, checkArray);
    }

    protected void setSolution(Sort solution) {
        this.solution = solution;
    }

    protected void repeatSortTest(int repeatTimes) {
        for (int i = 0; i < repeatTimes; ++i) {
            testSort();
        }
    }

    private void assertSolutionSet() {
        if (solution == null) {
            Assertions.fail("A sort solution must be set first.");
        }
    }
}
