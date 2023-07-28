package com.example.spring4shell;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringController {

    @GetMapping("/spring")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new user());
        return "index";
    }   

    @PostMapping("/spring")
    public String greetingSubmit(@ModelAttribute user user, Model model) {
        return "index";
    }

}
	

