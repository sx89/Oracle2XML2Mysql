package com.sx.createxml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 10:27
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.err.println("hello world");
        return "hello";
    }
}