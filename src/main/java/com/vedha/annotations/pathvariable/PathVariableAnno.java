package com.vedha.annotations.pathvariable;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class PathVariableAnno {

    @GetMapping(
            value = {"/pathVariable/{value}", "/pathVariableTest/{value}"},
            consumes = {MediaType.ALL_VALUE},
            produces = {MediaType.TEXT_PLAIN_VALUE}
    )
    public ResponseEntity<String> getSampleMethod(@PathVariable("value") String value) {

        System.out.println(value);
        return new ResponseEntity<>("Spring PathVariable Annotation : ".concat(value), HttpStatus.OK);
    }

    @GetMapping(
            value = {"/pathVariable/{value}/{age}", "/pathVariableTest/{value}/{age}"},
            consumes = {MediaType.ALL_VALUE},
            produces = {MediaType.TEXT_PLAIN_VALUE}
    )
    public ResponseEntity<String> getSampleMethods(@PathVariable("value") String value, @PathVariable("age") String age) {

        System.out.println(value.concat(", ").concat(age));
        return new ResponseEntity<>("Spring PathVariable Annotation : ".concat(value).concat(", ").concat(age), HttpStatus.OK);
    }
}
