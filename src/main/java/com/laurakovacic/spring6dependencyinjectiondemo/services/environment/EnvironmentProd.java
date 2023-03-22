package com.laurakovacic.spring6dependencyinjectiondemo.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class EnvironmentProd implements EnvironmentService {
    @Override
    public String getEnv() {
        return "PROD data";
    }
}
