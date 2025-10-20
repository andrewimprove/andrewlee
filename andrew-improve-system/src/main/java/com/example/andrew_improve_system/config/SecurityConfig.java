package com.example.andrew_improve_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .securityMatcher("/**") // apply to all endpoints
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // allow all
                .csrf(AbstractHttpConfigurer::disable); // disable CSRF using new syntax

        return http.build();
    }
}
