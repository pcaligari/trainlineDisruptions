package com.pcaligari.trainlineDisruptions;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TrainlineDisruptionsController {
    @RequestMapping("/")
    public String index() {
        return "Hello World!!!";
    }
}
