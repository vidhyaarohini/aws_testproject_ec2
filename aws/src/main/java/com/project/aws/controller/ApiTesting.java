package com.project.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTesting {
    @GetMapping("/api/test")
    public String getMessage(){
        return "hello";
    }
}
