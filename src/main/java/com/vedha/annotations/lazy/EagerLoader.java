package com.vedha.annotations.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {

    // Spring default loading the beans at eager level.
    // Constructor will be called at the time of application start up.
    public EagerLoader() {

        System.out.println("Eager Loader.....");
    }
}
