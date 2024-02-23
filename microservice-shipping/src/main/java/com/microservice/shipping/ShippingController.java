package main.java.com.microservice.shipping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {
    
    @GetMapping("/json")
    public String json() {
        
        return "{\"message\":\"hello\"}";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
