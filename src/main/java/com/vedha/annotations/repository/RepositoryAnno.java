package com.vedha.annotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryAnno {

    public String getSampleMethod() {

        return "Spring Boot --> Repository Annotation";
    }
}
