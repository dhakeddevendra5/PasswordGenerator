package com.example.demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class PasswordGeneratorOptions {
    
    @Min(value = 8, message = "Password length must be at least 8 characters")
    @Max(value = 100, message = "Password length must not exceed 100 characters")
    private int length = 12;
    
    private boolean includeUppercase = true;
    private boolean includeLowercase = true;
    private boolean includeNumbers = true;
    private boolean includeSpecialChars = true;
    private boolean excludeSimilarChars = false;
    private boolean excludeAmbiguousChars = false;
    private int passwordCount = 1;
    
    public int getLength() {
        return length;
    }
    
    public boolean isIncludeUppercase() {
        return includeUppercase;
    }
    
    public boolean isIncludeLowercase() {
        return includeLowercase;
    }
    
    public boolean isIncludeNumbers() {
        return includeNumbers;
    }
    
    public boolean isIncludeSpecialChars() {
        return includeSpecialChars;
    }
    
    public boolean isExcludeSimilarChars() {
        return excludeSimilarChars;
    }
    
    public boolean isExcludeAmbiguousChars() {
        return excludeAmbiguousChars;
    }
    
    public int getPasswordCount() {
        return passwordCount;
    }
    
    // Setters
    public void setLength(int length) {
        this.length = length;
    }
    
    public void setIncludeUppercase(boolean includeUppercase) {
        this.includeUppercase = includeUppercase;
    }
    
    public void setIncludeLowercase(boolean includeLowercase) {
        this.includeLowercase = includeLowercase;
    }
    
    public void setIncludeNumbers(boolean includeNumbers) {
        this.includeNumbers = includeNumbers;
    }
    
    public void setIncludeSpecialChars(boolean includeSpecialChars) {
        this.includeSpecialChars = includeSpecialChars;
    }
    
    public void setExcludeSimilarChars(boolean excludeSimilarChars) {
        this.excludeSimilarChars = excludeSimilarChars;
    }
    
    public void setExcludeAmbiguousChars(boolean excludeAmbiguousChars) {
        this.excludeAmbiguousChars = excludeAmbiguousChars;
    }
    
    public void setPasswordCount(int passwordCount) {
        this.passwordCount = passwordCount;
    }
    
    
}
