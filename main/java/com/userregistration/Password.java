package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public boolean getPassword(String password){
        String passwordRegex=("^[A-Za-z]{8,}$");
        Pattern patternobj= Pattern.compile(passwordRegex) ;
        Matcher matcherobj= patternobj.matcher(password);
        boolean result=matcherobj.matches();
        return result;
    }
}

