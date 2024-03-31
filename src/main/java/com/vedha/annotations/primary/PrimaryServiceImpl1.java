package com.vedha.annotations.primary;

import org.springframework.stereotype.Component;

@Component
public class PrimaryServiceImpl1 implements PrimaryService{
    @Override
    public String getPrimaryMethod() {
        return "Spring Boot Primary Annotation Service 1";
    }
}
