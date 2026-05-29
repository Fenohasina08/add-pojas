package com.add.demo.endpoint.rest.controller.arith;

import com.add.demo.services.ArithService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArithController {
  private final ArithService arithService;

  @GetMapping("/add")
  public int add(int a, int b) {
    return arithService.add(a, b);
  }

  @GetMapping("/soustract")
  public int soustract(int a, int b) {
    return arithService.soustract(a, b);
  }

  @GetMapping("/multiply")
  public int multiply(int a, int b) {
    return arithService.multiply(a, b);
  }

  @GetMapping("/divide")
  public int divide(int a, int b) {
    return arithService.divide(a, b);
  }
}
