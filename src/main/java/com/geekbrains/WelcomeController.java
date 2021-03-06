package com.geekbrains;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("message", "Hello World");
    return "index";
  }
}