package com.vedha.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QualifierAnno {

    @Autowired
    @Qualifier("qualifierServiceImpl1")
    private QualifierService qualifierService;

    public String getQualifier() {

        return qualifierService.getSampleMethod();
    }
}
