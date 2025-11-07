package com.automaterelease.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello endpoint was called");
        return "Hello from Automate-Release Spring Boot Application!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully!";
    }

}

