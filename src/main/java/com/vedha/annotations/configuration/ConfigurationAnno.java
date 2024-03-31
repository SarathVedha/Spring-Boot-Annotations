package com.vedha.annotations.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAnno {

    public String getSampleMethod() {

        return "Spring Boot --> Configuration Annotation";
    }
}
