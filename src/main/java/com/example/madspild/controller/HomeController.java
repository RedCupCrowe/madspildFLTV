package com.example.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "footerAndHeader";
    }

    /*
    @GetMapping("omos")
    public String omOs(){
        return "omOs";
    }
    */

}
