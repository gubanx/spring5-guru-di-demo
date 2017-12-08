package org.sample.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Controlador con Primary";
    }

}