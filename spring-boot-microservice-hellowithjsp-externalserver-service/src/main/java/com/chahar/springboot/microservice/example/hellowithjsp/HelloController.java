package com.chahar.springboot.microservice.example.hellowithjsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

  @GetMapping("/helloWithJsp1")
  public ModelAndView showHelloWithJsp(ModelMap model){
    model.addAttribute("message21","message from hellowithjsp-service");
    return new ModelAndView("helloWithJsp",model);
  }
}