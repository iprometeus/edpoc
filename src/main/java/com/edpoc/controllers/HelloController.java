package com.edpoc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final String GREETING = "Hey, man!";

    @GetMapping(value = "/greeting")
    public String greeting() {
        return GREETING;
    }
}
