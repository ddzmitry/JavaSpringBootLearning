package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    //    Controller to Show Form
    @RequestMapping("/showForm")
    public String ShowForm() {
        return "hello-form";
    }

    @RequestMapping("/submitForm")
    public String submitForm() {
        return "submited-form";
    }

    @RequestMapping("/processformVersionTwo")
    public String letsShoutDude(HttpServletRequest req, Model model) {
//    model container that holds data
        String theLast = req.getParameter("studentLast");
        String theName = req.getParameter("studentFirst");
        theName = theName.toUpperCase();
        String result = "Yo! " + theName + " " + theLast.toUpperCase();
        model.addAttribute("NumberOfLife", 42);
        model.addAttribute("message", result);
        return "helloWorld";
    }
}
