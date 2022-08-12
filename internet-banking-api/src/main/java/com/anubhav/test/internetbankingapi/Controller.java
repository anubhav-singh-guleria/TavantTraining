package com.anubhav.test.internetbankingapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/actuator/info")
    public String startingInfo(){
        return "Hello service 1";
    }
}
