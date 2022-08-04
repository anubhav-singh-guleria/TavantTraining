package com.tavant.restservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/sample")
    public SampleResponse sample(@RequestParam(value = "name",defaultValue = "Rest Serivce") String name){
        return new SampleResponse(101,name);
    }
    @RequestMapping("/hello")
    public String sayHi(){
        System.out.println("Hello World");
        return "Hello World";
    }
    @RequestMapping("phonenumber")
    public int test(){
        return 819181;  
    }
}
