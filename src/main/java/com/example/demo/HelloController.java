package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Spring works ✅ Java 21 CI Works.  CD works. Testing for SonarQube!!!!";
    }
}
