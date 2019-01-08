package com.luv2code.springdemo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
//Add Parent Mapping
@RequestMapping("/hello")
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
        String result = "Yayayay " + theName + " " + theLast.toUpperCase();
        model.addAttribute("NumberOfLife", 42);
        model.addAttribute("message", result);
        model.addAttribute("user",theName);

        return "helloWorld";
    }
    // Use binding
    @RequestMapping("/processformVersionThree")
    //    Bind variables to Model
    public String letsShoutDudeBinding(@RequestParam("studentFirst") String theName,
                                       @RequestParam("studentLast") String theLast,
                                       Model model) {
        model.addAttribute("first",theName.toUpperCase());
        model.addAttribute("last",theLast.toUpperCase());
        model.addAttribute("full",String.format("%s %s",theName,theLast).toUpperCase());
    //    model container that holds data
        return "helloWorld";
    }
}
