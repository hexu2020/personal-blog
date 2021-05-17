package com.hexu.personalblog.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloblog {
    @RequestMapping("/hello")
    public String helloBlog(){
        return "success-two";
    }
}
