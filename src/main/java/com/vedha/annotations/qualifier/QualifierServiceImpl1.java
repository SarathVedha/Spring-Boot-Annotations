package com.vedha.annotations.qualifier;

import org.springframework.stereotype.Component;

@Component
public class QualifierServiceImpl1 implements QualifierService{
    @Override
    public String getSampleMethod() {
        return "Spring Boot --> Qualifier Annotation Service 1";
    }
}
