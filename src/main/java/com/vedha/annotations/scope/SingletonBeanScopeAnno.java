package com.vedha.annotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBeanScopeAnno {

    public SingletonBeanScopeAnno() {

        System.out.println("Spring Boot --> SingletonBean Scope Annotation");
    }
}
