package com.example.demo.controller;

import com.example.demo.model.PasswordGeneratorOptions;
import com.example.demo.service.PasswordGeneratorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/passwords")
public class PasswordGeneratorRestController {

    private final PasswordGeneratorService passwordGeneratorService;

    @Autowired
    public PasswordGeneratorRestController(PasswordGeneratorService passwordGeneratorService) {
        this.passwordGeneratorService = passwordGeneratorService;
    }

    @PostMapping
    public ResponseEntity<Map<String, List<String>>> generatePasswords(@Valid @RequestBody PasswordGeneratorOptions options) {
        List<String> passwords = passwordGeneratorService.generatePasswords(options);
        return ResponseEntity.ok(Map.of("passwords", passwords));
    }
}
