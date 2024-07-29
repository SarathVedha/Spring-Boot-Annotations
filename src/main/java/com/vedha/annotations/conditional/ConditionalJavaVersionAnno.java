package com.vedha.annotations.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnJava(value = JavaVersion.SEVENTEEN, range = ConditionalOnJava.Range.EQUAL_OR_NEWER)
// ConditionalOnJava annotation checks the Java version and creates the bean if the Java version is 17 or newer.
public class ConditionalJavaVersionAnno {

    public void print() {

        System.out.println("Bean Created with Java 17 or newer");
    }
}
