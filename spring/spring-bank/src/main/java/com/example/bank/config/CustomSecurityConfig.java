package com.example.bank.config;

import com.example.bank.global.JwtFilter;
import com.example.bank.global.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@RequiredArgsConstructor
public class CustomSecurityConfig {

    private final UserDetailsService userDetailsService;
    private final JwtFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.formLogin(AbstractHttpConfigurer::disable);
        http.csrf(AbstractHttpConfigurer::disable);
        // http.cors();
        http.userDetailsService(userDetailsService);
        http.addFilterBefore(jwtFilter,
                UsernamePasswordAuthenticationFilter.class);
        http.authorizeHttpRequests(
                request -> request
                        .requestMatchers("/api/v1/auth/login",
                                "/api/v1/auth/register")
                        .permitAll()
                        .anyRequest()
                        .authenticated());
        return http.build();
    }
}
