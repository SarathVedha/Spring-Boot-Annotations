package com.vedha.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnno {

    @Value("Spring Boot --> Value Annotation (Default)")
    private String defaultValue;

    @Value("${value.anno}")
    private String propertyValue;

    @Value("${java.home}")
    private String sysValue;

    @Value("${OS}")
    private String envValue;

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public String getSysValue() {
        return sysValue;
    }

    public String getEnvValue() {
        return envValue;
    }
}
