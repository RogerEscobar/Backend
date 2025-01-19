package com.example.C20_Spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/admin")
    public String admin() {
        return "Admin access";
    }

    @GetMapping("/user")
    public String user(){
        return "User access";
    }
}
