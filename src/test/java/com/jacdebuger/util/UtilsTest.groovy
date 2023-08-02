package com.jacdebuger.util

import static org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.Test


class UtilsTest {
    @Test
    public void testSum() {
        assertEquals(1, Utils.add(1, 0))
        assertEquals(2, Utils.add(0, 2))
        assertEquals(3, Utils.add(1, 2))
    }
}