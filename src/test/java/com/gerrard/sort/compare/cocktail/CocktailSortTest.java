package com.gerrard.sort.compare.cocktail;

import com.gerrard.sort.BasicSortTest;
import com.gerrard.sort.Sort;
import org.junit.jupiter.api.Test;

public class CocktailSortTest extends BasicSortTest {

    private Sort solution = new CocktailSort();

    @Test
    void testCocktailSort() {
        setSolution(solution);
        testSort();
    }

    @Test
    void repeatTestCocktailSort() {
        setSolution(solution);
        repeatSortTest(1000);
    }
}
