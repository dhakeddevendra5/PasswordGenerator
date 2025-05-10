package com.example.demo.service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.PasswordGeneratorOptions;

@Service
public class PasswordGeneratorService {

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBER_CHARS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:,.<>?/";
    private static final String SIMILAR_CHARS = "il1Lo0O";
    private static final String AMBIGUOUS_CHARS = "{}[]()/\\'\"`~,;:.<>";
    
    private final SecureRandom random = new SecureRandom();

    public List<String> generatePasswords(PasswordGeneratorOptions options) {
        List<String> passwords = new ArrayList<>();
        
        for (int i = 0; i < options.getPasswordCount(); i++) {
            passwords.add(generatePassword(options));
        }
        
        return passwords;
    }
    
    private String generatePassword(PasswordGeneratorOptions options) {
        StringBuilder allowedChars = new StringBuilder();
        
        if (options.isIncludeLowercase()) {
            allowedChars.append(LOWERCASE_CHARS);
        }
        
        if (options.isIncludeUppercase()) {
            allowedChars.append(UPPERCASE_CHARS);
        }
        
        if (options.isIncludeNumbers()) {
            allowedChars.append(NUMBER_CHARS);
        }
        
        if (options.isIncludeSpecialChars()) {
            allowedChars.append(SPECIAL_CHARS);
        }
        
        // Handle exclusions
        String charPool = allowedChars.toString();
        if (options.isExcludeSimilarChars()) {
            for (char c : SIMILAR_CHARS.toCharArray()) {
                charPool = charPool.replace(String.valueOf(c), "");
            }
        }
        
        if (options.isExcludeAmbiguousChars()) {
            for (char c : AMBIGUOUS_CHARS.toCharArray()) {
                charPool = charPool.replace(String.valueOf(c), "");
            }
        }
        
        // Ensure we have at least some characters to work with
        if (charPool.isEmpty()) {
            charPool = LOWERCASE_CHARS;
        }
        
        StringBuilder password = new StringBuilder(options.getLength());
        
        // Ensure we meet minimum requirements
        if (options.isIncludeLowercase()) {
            password.append(getRandomChar(LOWERCASE_CHARS));
        }
        
        if (options.isIncludeUppercase()) {
            password.append(getRandomChar(UPPERCASE_CHARS));
        }
        
        if (options.isIncludeNumbers()) {
            password.append(getRandomChar(NUMBER_CHARS));
        }
        
        if (options.isIncludeSpecialChars()) {
            password.append(getRandomChar(SPECIAL_CHARS));
        }
        
        // Fill the rest of the password with random characters
        while (password.length() < options.getLength()) {
            password.append(getRandomChar(charPool));
        }
        
        // Shuffle the password characters
        char[] passwordChars = password.toString().toCharArray();
        for (int i = 0; i < passwordChars.length; i++) {
            int randomIndex = random.nextInt(passwordChars.length);
            char temp = passwordChars[i];
            passwordChars[i] = passwordChars[randomIndex];
            passwordChars[randomIndex] = temp;
        }
        
        return new String(passwordChars);
    }
    
    private char getRandomChar(String charPool) {
        int randomIndex = random.nextInt(charPool.length());
        return charPool.charAt(randomIndex);
    }
}
