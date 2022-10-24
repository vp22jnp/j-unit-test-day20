package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSpecialCharacter {
    public boolean getPasswordspecialcharacter(String password){
        String passwordRegex=("^(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9]{8,}$");
        Pattern patternobj= Pattern.compile(passwordRegex) ;
        Matcher matcherobj= patternobj.matcher(password);
        boolean privacy=matcherobj.matches();
        return privacy;
    }
}

