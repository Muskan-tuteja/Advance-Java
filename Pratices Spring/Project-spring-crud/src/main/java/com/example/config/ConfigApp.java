package com.example.config;

import com.example.database.DataBaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class ConfigApp {
    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public DataBaseConnection dbConnection() {
        return new DataBaseConnection();
    }

}
