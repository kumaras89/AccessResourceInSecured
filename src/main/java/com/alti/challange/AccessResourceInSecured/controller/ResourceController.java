package com.alti.challange.AccessResourceInSecured.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping( value="/resource")
    public String get() {
        return "data is returned";
    }

    @GetMapping("/apis")
    public String getApis() {
        return "data is returned";
    }


}
