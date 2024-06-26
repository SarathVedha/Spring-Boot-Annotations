package com.vedha.annotations.postMapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class PostMappingAnno {

    @PostMapping(
            value = {"/postMapping", "/postMappingPost"},
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<PostMappingDTO> getPostMap(@RequestBody PostMappingDTO postMappingDTO) {

        System.out.println(postMappingDTO);
        return new ResponseEntity<>(postMappingDTO, HttpStatus.CREATED);
    }
}
