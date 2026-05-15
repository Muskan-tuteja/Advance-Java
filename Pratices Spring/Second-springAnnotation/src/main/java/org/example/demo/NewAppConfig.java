package org.example.demo;

import org.example.looseCoupling.NotificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class NewAppConfig {
@Autowired
    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public lifeCycleBean lifeCycleBean (@Qualifier("emailNotificationServices") NotificationServices notification){
return new lifeCycleBean(notification);
    }
}
