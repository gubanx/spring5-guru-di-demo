package org.sample.didemo.controller;

import org.sample.didemo.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
