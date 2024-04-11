package com.vedha.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnno {

    @Value("Spring Boot --> Value Annotation (Default)")
    private String defaultValue; // Default value

    @Value("${value.anno}")
    private String propertyValue; // Property value

    @Value("${java.home}")
    private String sysValue; // System Variable value

    @Value("${OS}")
    private String envValue; // Environment Variable value

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
