package main.java.com.microservice.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @GetMapping("/json")
    public String json() {
        
        return "{\"message\":\"hello\"}";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
