package com.alti.challange.AccessResourceInSecured.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter
{
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests().antMatchers("/oauth/token").permitAll();

        http.requestMatchers().antMatchers("/resource")
                .and().authorizeRequests()
                .antMatchers("/resource").access("hasRole('USER')");
    }


}