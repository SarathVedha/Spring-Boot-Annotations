package com.vedha.annotations.requestmapping;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring") // http://localhost:8080/spring/requestMapping
@ResponseBody
public class RequestMappingAnno {

    @RequestMapping("/requestMapping")  // http://localhost:8080/requestMapping
    @ResponseBody // TO Get Plain Objects and json, *not for web pages required view resolver and html
    public String getSomeThing() {

        return "Spring Boot";
    }

    @RequestMapping({"/firstMapping", "/secondMapping"})
    @ResponseBody
    public String getMulti() {

        return "Multiple Request Mapping";
    }

    // Request Mapping By Default in Get Http Mapping
    @RequestMapping(
            value = "/requestMethod",
            method = RequestMethod.GET
    )
    @ResponseBody
    public String getHttpMethods() {

        return "Request Mapping Http Method";
    }

    @RequestMapping(
            value = {"/requestCon", "/requestPrd"},
            method = {RequestMethod.GET, RequestMethod.POST},
            consumes = MediaType.ALL_VALUE,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE}
    )
    public RequestMappingDTO getMethod() {

        return new RequestMappingDTO("Vedha", "12");
    }

}
