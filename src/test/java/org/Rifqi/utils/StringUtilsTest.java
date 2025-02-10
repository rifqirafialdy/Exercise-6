package org.Rifqi.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @Test
    void reverseString() {
        StringUtils utils = new StringUtils();

        // Test cases
        assertEquals("olleh", utils.reverseString("hello"));
        assertEquals("54321", utils.reverseString("12345"));
        assertEquals("", utils.reverseString(""));
        assertEquals("a", utils.reverseString("a"));
        assertEquals("  ", utils.reverseString("  "));
        assertEquals("!dlroW ,olleH", utils.reverseString("Hello, World!"));
    }
}
