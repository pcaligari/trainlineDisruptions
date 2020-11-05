package com.pcaligari.trainlineDisruptions.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TrainlineDisruptionsController {
    @RequestMapping("/hello")
    public String helloAction() {
        return "Hello World!!!";
    }
}
