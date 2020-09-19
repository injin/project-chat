package com.weather.chat.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home(Model model, HttpSession session) {
      
      System.out.println("home controller 요청 들어옴");
      model.addAttribute("test", "test data");
      return "home";
    }
    
    
}
