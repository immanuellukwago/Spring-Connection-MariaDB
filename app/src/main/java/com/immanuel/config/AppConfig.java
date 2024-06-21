package com.immanuel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.immanuel.connection.ConnectDB;
import com.immanuel.objects.Address;
import com.immanuel.objects.College;

@Configuration
@PropertySource("/com/app.properties")
@PropertySource("/com/connection.properties")
public class AppConfig {
    
    @Bean("college")
    public College college() {
        return new College();
    }

    @Bean("address")
    public Address address() {
        return new Address();
    }

    @Bean("connectDB") 
    public ConnectDB connectDB() {
        return new ConnectDB();
    }
}
