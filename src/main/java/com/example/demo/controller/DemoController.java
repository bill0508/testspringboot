package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "This is index v1";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World !";
    }
}
