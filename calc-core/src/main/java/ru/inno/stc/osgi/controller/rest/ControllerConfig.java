package ru.inno.stc.osgi.controller.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    CalculatorController calculatorController() {
        return new CalculatorController();
    }

}
