package com.laurakovacic.spring6dependencyinjectiondemo.controllers.i18n;

import com.laurakovacic.spring6dependencyinjectiondemo.services.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18NController {

    private final GreetingService greetingService;

    public i18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
