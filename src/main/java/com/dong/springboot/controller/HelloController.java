package com.dong.springboot.controller;

import com.dong.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/test")
    public String Hello(){
        return helloService.sayHello("yeyeyeyeye");
    }
}
