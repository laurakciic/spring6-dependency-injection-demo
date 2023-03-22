package com.laurakovacic.spring6dependencyinjectiondemo.controllers;

import com.laurakovacic.spring6dependencyinjectiondemo.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
