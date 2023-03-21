package com.laurakovacic.spring6dependencyinjectiondemo;

import com.laurakovacic.spring6dependencyinjectiondemo.controllers.ControllerDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DependencyInjectionDemoApplicationTests {

    @Autowired
    ApplicationContext applicationContext;
    
    @Autowired
    ControllerDemo controller;

    @Test
    void getControllerFromCtxTest() {
        ControllerDemo controller = applicationContext.getBean(ControllerDemo.class);

        System.out.println(controller.sayHello());
    }

    @Test
    void autowireOfControllerTest() {
        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
