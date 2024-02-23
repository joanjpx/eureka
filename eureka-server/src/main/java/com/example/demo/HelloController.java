package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    // return as JSON
    @GetMapping("/json")
    public String json() {
        
        return "{\"message\":\"hello\"}";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
