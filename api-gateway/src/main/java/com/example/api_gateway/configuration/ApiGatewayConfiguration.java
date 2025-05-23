package com.example.api_gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
    @Bean
    public RouteLocator getawayRouter(RouteLocatorBuilder builder) {

        return builder.routes()
                .route(p -> p.path("/cambio-service/**")
                        .uri("lb://cambio-service"))
                .route(p -> p.path("/book-service/**")
                        .uri("lb://book-service"))
                .build();
    }
}
