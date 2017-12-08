package org.sample.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Controlador con Primary";
    }

}
