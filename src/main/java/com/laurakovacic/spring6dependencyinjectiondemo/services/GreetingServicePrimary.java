package com.laurakovacic.spring6dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from Primary Bean";
    }
}
