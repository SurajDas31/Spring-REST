package com.virus.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
