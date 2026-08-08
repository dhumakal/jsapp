package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {

        int result = App.add(5, 5);

        assertEquals(10, result);
    }
}
