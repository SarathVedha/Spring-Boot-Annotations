package com.vedha.annotations.getmapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class GetMappingAnno {

    @GetMapping("/getMapping")
    public String getMethod() {

        return "Spring Get";
    }

    @GetMapping(
            value = {"firstGetMapping", "secondGetMapping"},
            consumes = {MediaType.ALL_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<GetMappingDTO> getMap() {

        return new ResponseEntity<>(new GetMappingDTO("Vedha", 12), HttpStatus.OK);
    }
}
