package com.demo.springbootinterviewquestions.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class DataSourceConfig {
    private String username;
    private String password;
}
