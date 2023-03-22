package com.laurakovacic.spring6dependencyinjectiondemo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerDemoTest {

    @Test
    void sayHello() {
        ControllerDemo controller = new ControllerDemo();

        System.out.println(controller.sayHello());
    }
}