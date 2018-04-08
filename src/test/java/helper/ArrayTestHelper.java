package helper;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Random;

public final class ArrayTestHelper {

    private ArrayTestHelper() {

    }

    public static void assertArrayEquals(int[] array1, int[] array2) {
        Assert.assertTrue(array1.length == array2.length);
        for (int i = 0; i < array1.length; ++i) {
            Assert.assertTrue(array1[i] == array2[i]);
        }
    }

    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int[] createRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; ++i) {
            array[i] = random.nextInt(max - min) + min;
        }
        return array;
    }
}
