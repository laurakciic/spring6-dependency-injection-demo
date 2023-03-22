package com.laurakovacic.spring6dependencyinjectiondemo.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from base service";
    }
}
