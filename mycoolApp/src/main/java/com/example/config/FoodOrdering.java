package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodOrdering {

	@Bean(name = "zomatoOnline")  // Name must match the @Qualifier in controller
    public OnlineOrder zomatoOnline() {
        return new ZomatoOnline();
    }
}
