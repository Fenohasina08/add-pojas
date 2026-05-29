package com.add.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithServiceTest {

    private ArithService arithService;

    @BeforeEach
    void setUp() {
        arithService = new ArithService();
    }

    @Test
    void add_two_positive_numbers_should_return_their_sum() {
        assertEquals(15, arithService.add(5, 10));
    }

    @Test
    void add_negative_numbers_should_throw_exception() {
        assertThrows(IllegalArgumentException.class, () -> arithService.add(-5, -10));
    }

    @Test
    void multiply_should_return_product() {
        assertEquals(6, arithService.multiply(2, 3));
    }

    @Test
    void soustract_should_return_difference() {
        assertEquals(1, arithService.soustract(2, 1));
    }

    @Test
    void divide_should_return_quotient() {
        assertEquals(1, arithService.divide(2, 2));
    }
}