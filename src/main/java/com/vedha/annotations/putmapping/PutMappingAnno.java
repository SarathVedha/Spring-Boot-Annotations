package com.vedha.annotations.putmapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class PutMappingAnno {

    @PutMapping("/putMapping")
    public String getPutMap() {

        return "Spring PutMapping Annotation";
    }

    @PutMapping(
            value = {"firstPutMapping", "secondPutMapping"},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<PutMappingDTO> getMapping(@RequestBody PutMappingDTO putMappingDTO) {

        System.out.println(putMappingDTO.toString());
        return new ResponseEntity<>(putMappingDTO, HttpStatus.CREATED);
    }
}
