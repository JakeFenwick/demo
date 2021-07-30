package com.goanna.controller;

import com.goanna.controller.Entity.MyName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {


    @GetMapping()
    public String myName(@RequestParam(value = "name", defaultValue = "Jake") String name) {
        return "Hello my Name is: "+ (new MyName(name)).getName();
    }
}