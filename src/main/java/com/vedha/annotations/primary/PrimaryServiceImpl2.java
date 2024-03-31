package com.vedha.annotations.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryServiceImpl2 implements PrimaryService{
    @Override
    public String getPrimaryMethod() {
        return "Spring Boot --> Primary Annotation Service 2";
    }
}
