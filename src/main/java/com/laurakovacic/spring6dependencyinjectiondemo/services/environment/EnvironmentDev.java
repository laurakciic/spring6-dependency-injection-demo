package com.laurakovacic.spring6dependencyinjectiondemo.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvironmentDev implements EnvironmentService {

    @Override
    public String getEnv() {
        return "DEV";
    }
}
