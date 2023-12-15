package com.demo.springbootinterviewquestions.config;

import com.demo.springbootinterviewquestions.service.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DemoService demoService(){
        return new DemoService();
    }
}
