package com.vedha.annotations.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAnno {

    @Bean
    public BeanClass getBeanMethod() {

        return new BeanClass();
    }
}
