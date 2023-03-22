package com.laurakovacic.spring6dependencyinjectiondemo.controllers;

import com.laurakovacic.spring6dependencyinjectiondemo.services.greeting.GreetingService;
import com.laurakovacic.spring6dependencyinjectiondemo.services.greeting.GreetingServiceImpl;
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

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
