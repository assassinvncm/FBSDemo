package com.fbs.post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @GetMapping(value = "/get")
    public ResponseEntity<String> getPost(@RequestParam Long id){
        return new ResponseEntity<>("oke okesssss", HttpStatus.OK);
    }


}
