package com.ibudasov.reflectje.unit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibudasov.reflectje.service.ReflectjeService;

@Configuration
public class TestConfig {

    @Bean
    public ReflectjeService getReflectjeService() {
        return new ReflectjeService();
    }
}
