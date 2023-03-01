package com.java.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String hello(){
        return "home";
    }

    @RequestMapping("/help")
    public ModelAndView dohelp(){

        ModelAndView model = new ModelAndView();
        model.addObject("name","Ridham");
        model.addObject("id",20);

        return model;
    }



}
