package com.example.demo.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
            return "home"; 
        }

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    
    
}