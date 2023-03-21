package com.laurakovacic.spring6dependencyinjectiondemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerDemo {

    public String sayHello() {
        System.out.println("I'm in the controller");

        return "Hello everyone";
    }
}
