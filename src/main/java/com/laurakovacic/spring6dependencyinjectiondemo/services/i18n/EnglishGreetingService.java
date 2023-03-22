package com.laurakovacic.spring6dependencyinjectiondemo.services.i18n;

import com.laurakovacic.spring6dependencyinjectiondemo.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}