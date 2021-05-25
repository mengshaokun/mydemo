package com.msk.docertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestDockerController {

    @GetMapping("/docker")
    public String testDocker() {
        return "Hello Test Docker Controller Success";
    }
}
