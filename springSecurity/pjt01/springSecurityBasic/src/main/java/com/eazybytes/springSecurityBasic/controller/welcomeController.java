package com.eazybytes.springSecurityBasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/welcome")
    public String sayWelcome()
    {
        return "Welcome to Spring Application with out Security";
    }
}
