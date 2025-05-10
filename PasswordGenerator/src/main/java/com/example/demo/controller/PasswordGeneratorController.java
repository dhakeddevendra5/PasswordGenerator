package com.example.demo.controller;

import com.example.demo.model.PasswordGeneratorOptions;
import com.example.demo.service.PasswordGeneratorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PasswordGeneratorController {

    private final PasswordGeneratorService passwordGeneratorService;

    @Autowired
    public PasswordGeneratorController(PasswordGeneratorService passwordGeneratorService) {
        this.passwordGeneratorService = passwordGeneratorService;
    }

    @GetMapping("/")
    public String showGenerator(Model model) {
        model.addAttribute("options", new PasswordGeneratorOptions());
        return "generator";
    }

    @PostMapping("/generate")
    public String generatePassword(@Valid @ModelAttribute("options") PasswordGeneratorOptions options,
                                  BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "generator";
        }

        List<String> passwords = passwordGeneratorService.generatePasswords(options);
        model.addAttribute("passwords", passwords);
        return "generator";
    }
    
    @PostMapping("/api/generate")
    @ResponseBody
    public List<String> generatePasswordApi(@Valid @ModelAttribute PasswordGeneratorOptions options) {
        return passwordGeneratorService.generatePasswords(options);
    }
}
