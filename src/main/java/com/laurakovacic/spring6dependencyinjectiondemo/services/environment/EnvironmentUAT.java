package com.laurakovacic.spring6dependencyinjectiondemo.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentUAT implements EnvironmentService {
    @Override
    public String getEnv() {
        return "UAT";
    }
}
