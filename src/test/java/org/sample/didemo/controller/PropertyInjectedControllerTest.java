package org.sample.didemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sample.didemo.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @Before
    public void init() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }

}
