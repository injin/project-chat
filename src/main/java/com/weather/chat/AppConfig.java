package com.weather.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AppConfig {
    
    @Autowired
    Environment env;
    
    public AppConfig() {
        System.out.println("AppConfig() 호출됨!");
    }
    
}
