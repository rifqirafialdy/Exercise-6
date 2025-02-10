package org.Rifqi.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArraysNumberTest {

    private final ArraysNumber utils = new ArraysNumber();

    @Test
    void rotate() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(3, 4, 5, 1, 2);
        assertEquals(expected, utils.rotate(input, 2));
    }

    @Test
    void isDuplicate() {
        List<Integer> inputWithDuplicates = Arrays.asList(1, 2, 3, 4, 2);
        List<Integer> inputWithoutDuplicates = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(utils.isDuplicate(inputWithDuplicates));
        assertFalse(utils.isDuplicate(inputWithoutDuplicates));
    }

    @Test
    void removeDuplicate() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, utils.removeDuplicate(input));
    }

    @Test
    void sortArray() {
        List<Integer> input = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> expectedAsc = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedDesc = Arrays.asList(5, 4, 3, 2, 1);

        assertEquals(expectedAsc, utils.sortArray(input, "asc"));
        assertEquals(expectedDesc, utils.sortArray(input, "desc"));
    }

    @Test
    void removeAllOccurance() {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4, 2, 5);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5);
        assertEquals(expected, utils.removeAllOccurance(input, 2));
    }

    @Test
    void findAllDuplicate() {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        List<Integer> expected = Arrays.asList(2, 3); // Order may vary
        assertTrue(utils.findAllDuplicate(input).containsAll(expected));
    }

    @Test
    void checkTemperature() {
        List<Integer> input = Arrays.asList(30, 40, 50, 20, 60);
        List<Integer> expected = Arrays.asList(1, 1, 2, 1, 0);
        assertEquals(expected, utils.checkTemperature(input));
    }


}
