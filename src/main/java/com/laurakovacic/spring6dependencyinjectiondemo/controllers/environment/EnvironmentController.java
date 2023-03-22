package com.laurakovacic.spring6dependencyinjectiondemo.controllers.environment;

import com.laurakovacic.spring6dependencyinjectiondemo.services.environment.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "Currently in " + environmentService.getEnv() + " Environment.";
    }
}
