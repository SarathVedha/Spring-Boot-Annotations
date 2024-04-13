package com.vedha.annotations.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAnno {

    // This is a simple bean creation method
    // Created at the time of application context creation and destroyed when the application context is closed
    // its scope is singleton by default
    @Bean
    public BeanClass getBeanMethod() {

        return new BeanClass();
    }

    // initMethod has been called at the time of bean creation at the time of application context creation
    // destroyMethod has been called at the time of bean destruction at the time of (application context close)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanLifeCycle getBeanLifeCycle() {

        return new BeanLifeCycle();
    }

    @Bean
    public BeanLifeCycleAnno getBeanLifeCycleAnno() {

        return new BeanLifeCycleAnno();
    }
}
