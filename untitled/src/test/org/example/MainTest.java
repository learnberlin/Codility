package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    @Test
    void testSum() {
        assertEquals(22,main.sum(12,1));
    }
}