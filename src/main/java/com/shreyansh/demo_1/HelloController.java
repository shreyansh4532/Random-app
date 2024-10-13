package com.shreyansh.demo_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, first Spring Boot Application!!";
    }

    @GetMapping("/api/user")
    public String userInfo() {
        return "This is the user information";
    }

    @GetMapping("/api/create-user")
    public String newUser() {
        return "Please enter details";
    }

}
