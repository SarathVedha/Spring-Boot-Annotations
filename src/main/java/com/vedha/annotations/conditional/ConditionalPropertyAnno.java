package com.vedha.annotations.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "conditional.property", havingValue = "true", prefix = "vedha")
public class ConditionalPropertyAnno {

    public void print() {

        System.out.println("ConditionalPropertyAnno is loaded");
    }
}
