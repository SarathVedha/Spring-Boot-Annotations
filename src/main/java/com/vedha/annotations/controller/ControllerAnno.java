package com.vedha.annotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerAnno {

    public String getSampleMethod() {

        return "Spring Boot --> Controller Annotation";
    }
}
