package com.vedha.annotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceValue {

    @Autowired
    private Environment environment;

    @Value("${spring.custom}")
    private String propertyValue;

    public String getPropertyValue() {
        return propertyValue;
    }

    public String getPropertyValue2() {
        return environment.getProperty("spring.custom2");
    }
}
