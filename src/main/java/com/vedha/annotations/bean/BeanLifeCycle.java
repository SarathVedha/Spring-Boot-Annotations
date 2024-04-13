package com.vedha.annotations.bean;

public class BeanLifeCycle {

    public void init() {
        System.out.println("BeanLifeCycle.init() method called");
    }

    public void destroy() {
        System.out.println("BeanLifeCycle.destroy() method called");
    }

    public void display() {
        System.out.println("BeanLifeCycle.display() method called");
    }
}
