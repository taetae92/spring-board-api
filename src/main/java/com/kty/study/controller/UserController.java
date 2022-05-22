package com.kty.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/get")
    public String getTest() {
        return "success";
    }
}