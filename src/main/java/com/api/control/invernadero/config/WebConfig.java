package com.api.control.invernadero.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/bienvenido");
        registry.addMapping("/api/control");
        registry.addMapping("/api/reporte");
        registry.addMapping("/api/usuario");
        registry.addMapping("/api/VerReporte")
                .allowedOrigins("http://127.0.0.1:5500");
    }
}
