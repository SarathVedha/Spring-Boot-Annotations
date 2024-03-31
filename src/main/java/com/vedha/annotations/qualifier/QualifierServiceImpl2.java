package com.vedha.annotations.qualifier;

import org.springframework.stereotype.Component;

@Component
public class QualifierServiceImpl2 implements QualifierService{

    @Override
    public String getSampleMethod() {
        return "Spring Qualifier Annotation Service 2";
    }
}
