//package com.example.demo;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.example.demo.model.PasswordGeneratorOptions;
//import com.example.demo.service.PasswordGeneratorService;
//
//@SpringBootTest
//public class PasswordGeneratorServiceTest {
//
//    @Autowired
//    private PasswordGeneratorService passwordGeneratorService;
//
//    @Test
//    public void testDefaultPasswordGeneration() {
//        PasswordGeneratorOptions options = new PasswordGeneratorOptions();
//        List<String> passwords = passwordGeneratorService.generatePasswords(options);
//        
//        assertEquals(1, passwords.size());
//        assertEquals(12, passwords.get(0).length());
//    }
//    
//    @Test
//    public void testPasswordLength() {
//        PasswordGeneratorOptions options = new PasswordGeneratorOptions();
//        options.setLength(20);
//        
//        List<String> passwords = passwordGeneratorService.generatePasswords(options);
//        assertEquals(20, passwords.get(0).length());
//    }
//    
//    @Test
//    public void testMultiplePasswords() {
//        PasswordGeneratorOptions options = new PasswordGeneratorOptions();
//        options.setPasswordCount(5);
//        
//        List<String> passwords = passwordGeneratorService.generatePasswords(options);
//        assertEquals(5, passwords.size());
//    }
//    
//    @Test
//    public void testLowercaseOnly() {
//        PasswordGeneratorOptions options = new PasswordGeneratorOptions();
//        options.setIncludeUppercase(false);
//        options.setIncludeNumbers(false);
//        options.setIncludeSpecialChars(false);
//        
//        List<String> passwords = passwordGeneratorService.generatePasswords(options);
//        String password = passwords.get(0);
//        
//        assertTrue(password.chars().allMatch(Character::isLowerCase));
//    }
//    
//    @Test
//    public void testUppercaseOnly() {
//        PasswordGeneratorOptions options = new PasswordGeneratorOptions();
//        options.setIncludeLowercase(false);
//        options.setIncludeNumbers(false);
//        options.setIncludeSpecialChars(false);
//        
//        List<String> passwords = passwordGeneratorService.generatePasswords(options);
//        String password = passwords.get(0);
//        
//        assertTrue(password.chars().allMatch(Character::isUpperCase));
//    }
//}
