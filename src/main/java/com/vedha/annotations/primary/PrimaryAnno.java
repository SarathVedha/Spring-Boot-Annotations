package com.vedha.annotations.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrimaryAnno {

    @Autowired
    private PrimaryService primaryService;

    public String getSampleMethod() {

        return primaryService.getPrimaryMethod();
    }
}
