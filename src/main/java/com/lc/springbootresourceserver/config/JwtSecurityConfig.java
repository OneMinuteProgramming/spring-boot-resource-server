package com.lc.springbootresourceserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class JwtSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET,"/product")
                .hasAuthority("SCOPE_product.read")
                .requestMatchers(HttpMethod.POST,"/product")
                .hasAuthority("SCOPE_product.write")
                .and()
                .oauth2ResourceServer()
                .jwt();

        return http.build();
    }
}
