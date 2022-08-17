package com.example.HDFCbankingapigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/actuator/info")
    public String startingInfo() {
        return "Welcome to HDFC banking";
    }
    



}