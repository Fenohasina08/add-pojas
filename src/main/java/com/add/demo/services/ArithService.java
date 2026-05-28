package com.add.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ArithService {
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return a + b;
    }

    public int multiply(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return a * b;
    }
}
