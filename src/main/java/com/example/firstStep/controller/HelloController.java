package com.example.firstStep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, SpringBoot!";
    }

    @GetMapping("/greet")
    public String greerUser() {
        return "Welcome to Spring Boot!!";
    }
}
