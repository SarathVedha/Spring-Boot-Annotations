package com.vedha.annotations.requestbody;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spring")
public class RequestBodyAnno {

    // RequestBody can be used in method filed level only.
    @GetMapping(
            value = {"requestBody", "requestBodyGet"},
            consumes = {MediaType.TEXT_PLAIN_VALUE},
            produces = {MediaType.ALL_VALUE}
    )
    public ResponseEntity<String> getReqBody(@RequestBody String name) {

        System.out.println(name);
        return new ResponseEntity<>("Spring RequestBody Annotation : ".concat(name), HttpStatus.OK);
    }
}
