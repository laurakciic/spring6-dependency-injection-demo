package com.laurakovacic.spring6dependencyinjectiondemo.controllers;

import com.laurakovacic.spring6dependencyinjectiondemo.services.GreetingService;
import com.laurakovacic.spring6dependencyinjectiondemo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerDemo {

    private final GreetingService greetingService;

    public ControllerDemo() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
