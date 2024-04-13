package com.vedha.annotations.scope;

import org.springframework.stereotype.Component;

@Component
public class SpringDefaultScope {

    // Default Scope is Singleton
    public SpringDefaultScope() {

        System.out.println("Spring Boot Default Bean Scope Is Singleton Create Object only one time at start time");
    }
}
