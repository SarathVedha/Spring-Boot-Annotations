package com.vedha.annotations.responsebody;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring")
@ResponseBody
public class ResponseBodyAnno {

    // ResponseBody can be used in Class and Method level.
    @RequestMapping("/responseBodyPlain")
    @ResponseBody
    public String getSomeThing() {

        return "Hi Spring Boot";
    }

    @GetMapping("/responseBodyDTO")
    @ResponseBody
    public ResponseBodyDTO getDTO() {

        // Note DTO Must Be In Getter Setter.
        return new ResponseBodyDTO("Vedha", 21, false);
    }
}
