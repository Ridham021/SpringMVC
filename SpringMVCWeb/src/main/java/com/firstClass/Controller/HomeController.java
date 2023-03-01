package com.firstClass.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/helps")
    public String help(){
        System.out.printf("THis is help.jsp");

        return "help";
    }
}
