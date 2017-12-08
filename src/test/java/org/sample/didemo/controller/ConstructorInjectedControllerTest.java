package org.sample.didemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sample.didemo.service.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @Before
    public void init() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }


}
