package org.sample.didemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sample.didemo.service.GreetingServiceImpl;

public class GetterInjectedControllerTest {

    private GetterInjectedController controller;

    @Before
    public void init() {
        controller = new GetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }

}
