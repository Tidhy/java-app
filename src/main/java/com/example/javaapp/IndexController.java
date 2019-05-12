package com.example.javaapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {



    @ResponseBody
    @GetMapping
    public String index(){
            return "Jenkins run successfully";
    }
}
