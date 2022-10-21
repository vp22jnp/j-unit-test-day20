package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwordwith1upperCase {
    public boolean getPassworduppercase(String password){
        String passwordRegex=("^[A-Za-z0-9]{8,}$");
        Pattern patternobj= Pattern.compile(passwordRegex) ;
        Matcher matcherobj= patternobj.matcher(password);
        boolean result=matcherobj.matches();
        return result;
    }
}


