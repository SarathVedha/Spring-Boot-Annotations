package com.vedha.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredAnno {

    //Field Injection
    @Autowired
    private AutowiredService autowiredService;

    //Construct Injection
//    @Autowired
//    public AutowiredAnno(AutowiredService autowiredService) {
//        this.autowiredService = autowiredService;
//    }

    //Setter Injection
//    @Autowired
//    public void setAutowiredService(AutowiredService autowiredService) {
//        this.autowiredService = autowiredService;
//    }

    public String getAutoWiredMethod() {

        return autowiredService.getSampleMethod();
    }
}
