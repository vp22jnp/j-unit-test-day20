package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password1Numeric {
    public boolean getPasswordnumericcase(String password){
        String passwordRegex=("^(?=.*[A-Z])[a-zA-Z0-9]{8,}$");
        Pattern patternobj= Pattern.compile(passwordRegex) ;
        Matcher matcherobj= patternobj.matcher(password);
        boolean result=matcherobj.matches();
        return result;
    }
}


