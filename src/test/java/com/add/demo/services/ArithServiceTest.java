package com.add.demo.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithServiceTest {
    private final ArithService arithService = new ArithService();

    @Test
    void add_two_positive_numbers_should_return_their_sum() {
        var a = 5;
        var b = 10;

        var sum = arithService.add(a, b);

        assertEquals(15, sum);
    }

    @Test
    void add_negative_numbers_should_throw_exception() {
        var a = -5;
        var b = -10;

        assertThrows(IllegalArgumentException.class, () -> arithService.add(a, b));
    }
}