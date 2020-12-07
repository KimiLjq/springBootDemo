package com.kimi.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("Hello")
    public String hello() {
        return "Hello World";
    }
}
