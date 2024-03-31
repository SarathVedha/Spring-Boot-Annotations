package com.vedha.annotations.requestparam;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class RequestParamAnno {

    @GetMapping(
            value = {"/requestParam", "/requestParamTest"},
            consumes = {MediaType.ALL_VALUE},
            produces = {MediaType.TEXT_PLAIN_VALUE}
    )
    public String getSampleMethod(@RequestParam("name") String value) {

        System.out.println(value);
        return "Spring RequestParam Annotation : ".concat(value);
    }

    @GetMapping(
            value = {"/requestParams", "/requestParamsTest"},
            consumes = {MediaType.ALL_VALUE},
            produces = {MediaType.TEXT_PLAIN_VALUE}
    )
    public String getSampleMethods(@RequestParam("name") String value, @RequestParam("age") String age) {

        System.out.println(value.concat(", ").concat(age));
        return "Spring RequestParam Annotation : ".concat(value).concat(", ").concat(age);
    }

}
