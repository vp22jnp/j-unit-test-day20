package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public boolean getEmail(String email){
        String nameRegex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(email);
        boolean result=matcherobj.matches();
        return result;
    }
}

