package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojos.Student;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Value("#{OSOptions}")
    private Map<String,String> OSOptions;
    @Value("#{languageOptions}")
    private Map<String,String> languageOptions;
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String displayTheForm(Model theModel){

        // Create New Student Object
        Student theStudent = new Student();
        // add student object to model
        theModel.addAttribute("student",theStudent);

        theModel.addAttribute("theCountryOptions", countryOptions);
        theModel.addAttribute("languageOptions", languageOptions);
        theModel.addAttribute("OSOptions",OSOptions);

        // Form That uses Spring Attribute Form
        return  "studentForm";
    };

    @RequestMapping("/processForm")
    public String processTheForm(@ModelAttribute("student") Student theStudent){

        // Student will be passed from form
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        System.out.println(theStudent.getCountry());
        // Form That uses Spring Attribute Form
        return  "student-conformation";
    };

}
