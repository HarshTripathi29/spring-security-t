package com.example.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("hello")
    public String hello(HttpServletRequest request){
        //  It is used to retrieve request-related information when handling HTTP requests in a Spring Boot project.
        return "Hello world "+ request.getSession().getId();
    }
}
