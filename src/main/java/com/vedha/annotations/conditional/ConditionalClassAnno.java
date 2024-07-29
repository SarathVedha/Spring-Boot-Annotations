package com.vedha.annotations.conditional;

import com.vedha.annotations.bean.BeanLifeCycleAnno;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnClass(BeanLifeCycleAnno.class) // Passing class object as parameter
@ConditionalOnClass(name = "com.vedha.annotations.bean.BeanLifeCycle") // Passing class name with package as parameter
// This annotation will be processed only if BeanLifeCycle class is present in the classpath.
// If not, this class will not be processed.
public class ConditionalClassAnno {

    public void print() {

        System.out.println("ConditionalClassAnno is loaded");
    }
}
