package com.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("message", "Hello World");
    return "index";
  }
}