package com.add.demo.endpoint.rest.controller.arith;

import com.add.demo.services.ArithService;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArithController {
    private final ArithService arithService;

    @GetMapping("/add")
    public int add(int a, int b) {
        return arithService.add(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(int a, int b) {
        return  arithService.multiply(a,b);
    }
}
