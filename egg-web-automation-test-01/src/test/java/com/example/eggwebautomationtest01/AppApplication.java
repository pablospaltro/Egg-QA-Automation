package com.example.eggwebautomationtest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.from(App::main).with(AppApplication.class).run(args);
    }

}
