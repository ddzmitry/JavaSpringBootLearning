package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPoop {
    @RequestMapping(value = "/poop")
    public String Poop(){
        return "poop";

    }
}
