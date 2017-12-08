package org.sample.didemo.controller;

import org.sample.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello() {
        System.out.println(greetingService.sayGreeting());
    }

}
