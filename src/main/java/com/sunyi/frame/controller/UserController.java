package com.sunyi.frame.controller;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/test")
    public String test(){
        return "Hello world";
    }
}
