//package com.demo.springbootinterviewquestions.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@EnableWebMvc
//public class CorsConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/api/**")
//                .allowedOrigins("http://localhost:4200")    // Add your front-end application's origin
//                //.allowedOrigins("*") //If you want to allow for all just define *
//                .allowedMethods("GET", "POST", "PUT", "DELETE") //these http methods are only accessible
//                .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
//                .allowCredentials(true)
//                .maxAge(3600);
//    }
//}
