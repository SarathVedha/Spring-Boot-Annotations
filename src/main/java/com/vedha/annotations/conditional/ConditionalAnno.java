package com.vedha.annotations.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(CheckConditional.class)
public class ConditionalAnno {

    public void print() {
        System.out.println("ConditionalAnno is printed");
    }
}
