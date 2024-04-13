package com.vedha.annotations.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BeanLifeCycleAnno {

    @PostConstruct
    public void init(){
        System.out.println("BeanLifeCycleAnno.init() method called");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("BeanLifeCycleAnno.destroy() method called");
    }

    public void display(){
        System.out.println("BeanLifeCycleAnno.display() method called");
    }
}
