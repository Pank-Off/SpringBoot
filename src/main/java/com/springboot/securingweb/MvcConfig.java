package com.springboot.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home.html");
        registry.addViewController("/").setViewName("home.html");
        registry.addViewController("/hello").setViewName("hello.html");
        registry.addViewController("/login").setViewName("login.html");
    }

}