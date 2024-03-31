package com.vedha.annotations.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceAnno {

    public String getSampleMethod() {

        return "Spring Boot --> Service Annotation";
    }
}
