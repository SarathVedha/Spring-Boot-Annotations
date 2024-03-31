package com.vedha.annotations.autowired;

import org.springframework.stereotype.Component;

@Component
public class AutowiredService {

    public String getSampleMethod() {

        return "Spring Boot -> AutoWired Annotation";
    }
}
