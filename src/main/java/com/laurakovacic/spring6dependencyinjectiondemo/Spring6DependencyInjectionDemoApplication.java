package com.laurakovacic.spring6dependencyinjectiondemo;

import com.laurakovacic.spring6dependencyinjectiondemo.controllers.ControllerDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DependencyInjectionDemoApplication.class, args);

        ControllerDemo controller = ctx.getBean(ControllerDemo.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }

}
