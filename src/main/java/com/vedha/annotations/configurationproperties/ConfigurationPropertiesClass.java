package com.vedha.annotations.configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationPropertiesClass {

    @Autowired
    private ConfigurationPropertiesAnno configurationPropertiesAnno;

    public void printProperties() {

        System.out.println("Spring Boot --> ConfigurationProperties Annotation");
        System.out.println(configurationPropertiesAnno.getName());
        System.out.println(configurationPropertiesAnno.getDescription());
        System.out.println(configurationPropertiesAnno.getUploadDir());
        System.out.println(configurationPropertiesAnno.getSpecs());
        System.out.println(configurationPropertiesAnno.getSecurity().getUsername());
        System.out.println(configurationPropertiesAnno.getSecurity().getPassword());
        System.out.println(configurationPropertiesAnno.getSecurity().getRoles());
        System.out.println(configurationPropertiesAnno.getSecurity().isEnabled());
        System.out.println(configurationPropertiesAnno.getSecurity().getPermissions());
    }
}
