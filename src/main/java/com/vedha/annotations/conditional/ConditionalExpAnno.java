package com.vedha.annotations.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("'${vedha.conditional.property}'.equals('true')")
public class ConditionalExpAnno {

    public void print() {

        System.out.println("Conditional Expression Annotation");
    }
}
