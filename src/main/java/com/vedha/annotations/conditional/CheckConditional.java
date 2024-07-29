package com.vedha.annotations.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CheckConditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        // This is where you can write your custom logic to check if the condition is met or not
        // true means the condition is met and the bean will be created
        // false means the condition is not met and the bean will not be created
        return true;
    }
}
