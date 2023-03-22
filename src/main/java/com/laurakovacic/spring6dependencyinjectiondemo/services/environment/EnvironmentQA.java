package com.laurakovacic.spring6dependencyinjectiondemo.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentQA implements EnvironmentService {
    @Override
    public String getEnv() {
        return "QA";
    }
}
