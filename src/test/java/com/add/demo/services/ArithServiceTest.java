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

    @Test
    void add_two_positive_numbers_should_return_their_sum_of_multiply() {
        var a = 2;
        var b = 3;

        var sum = arithService.multiply(a,b);

        assertEquals(6,sum);
    }

    @Test
    void add_two_positive_numbers_should_return_their_sum_of_soustraction() {
        var a = 2;
        var b = 1;

        var sum = arithService.soustract(a,b);

        assertEquals(1,sum);
    }

}