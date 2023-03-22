package com.laurakovacic.spring6dependencyinjectiondemo.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
@SpringBootTest
class i18NControllerTestEN {

    @Autowired
    i18NController i18nController;

    @Test
    void sayHello() {
        System.out.println(i18nController.sayHello());
    }
}