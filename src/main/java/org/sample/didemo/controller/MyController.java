package org.sample.didemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("hola, bastardines!!!");
        return "hello";
    }

}
