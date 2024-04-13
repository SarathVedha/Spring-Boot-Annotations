package com.vedha.annotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoaderAnno {

    // Lazy loading the beans.
    // Constructor will be called at the time of bean creation. its singleton bean.
    public LazyLoaderAnno() {

        System.out.println("Lazy Loader....");
    }

    public String getSampleMethod() {

        return "Spring Boot --> Lazy Annotation";
    }
}
