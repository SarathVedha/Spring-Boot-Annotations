package com.vedha.annotations.deleteMapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class DeleteMappingAnno {

    @DeleteMapping(
            value = {"/deleteMapping", "/deleteMappingDEL"}
    )
    public ResponseEntity<String> getDeleteMap(@RequestParam("name") String name) {

        return new ResponseEntity<>("Spring DeleteMapping Annotation : ".concat(name), HttpStatus.OK);
    }
}
