package com.vedha.annotations.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(name = "getBeanMethod") // This annotation checks if the bean with the name getBeanMethod is present in the context
// getBeanMethod is available in bean package
public class ConditionalBeanAnno {

    public void print() {

        System.out.println("ConditionalBeanAnno is loaded");
    }
}
