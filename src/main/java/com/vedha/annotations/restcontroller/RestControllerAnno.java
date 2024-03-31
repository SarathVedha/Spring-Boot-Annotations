package com.vedha.annotations.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/spring")
public class RestControllerAnno {

    @RequestMapping("/restControllerPlain")
    public String getString() {

        return "hi Spring Boot";
    }

    @GetMapping("/restControllerDTO")
    public RestControllerDTO getRestDTO() {

        List<String> kids = new ArrayList<>();
        kids.add("Test1");
        kids.add("Test2");
        return new RestControllerDTO("Vedha", 22, true, kids);
    }
}
