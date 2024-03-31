package com.vedha.annotations.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentAnno {

    public String getSampleMethod() {

        return "Spring Boot -> Component Annotation";
    }
}
