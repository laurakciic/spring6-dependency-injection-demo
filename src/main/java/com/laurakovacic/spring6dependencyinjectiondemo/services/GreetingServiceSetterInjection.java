package com.laurakovacic.spring6dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Setting a greeting";
    }
}
