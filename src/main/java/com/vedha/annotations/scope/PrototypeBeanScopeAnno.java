package com.vedha.annotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBeanScopeAnno {

    // PrototypeBeanScopeAnno Constructor creates a new instance every time it is called
    public PrototypeBeanScopeAnno() {

        System.out.println("Spring Boot --> PrototypeBean Scope Annotation");
    }
}
