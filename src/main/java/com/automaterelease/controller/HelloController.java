package com.automaterelease.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@RestController
@RequestMapping("/api")
public class HelloController {

    private final AtomicReference<String> statusMessage =
            new AtomicReference<>("Application is running successfully!");

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello endpoint was called");
        return "Hello from Automate-Release Spring Boot Application!";
    }

    @GetMapping("/status")
    public String status() {
        return statusMessage.get();
    }

    @PutMapping("/status")
    public String updateStatus(@RequestBody String newStatus) {
        statusMessage.set(newStatus);
        return statusMessage.get();
    }

}
