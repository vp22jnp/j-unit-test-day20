package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleEmailEntry {
    public boolean getmultipleEmail(String email){
        String nameRegex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(email);
        boolean result=matcherobj.matches();
        boolean result1=matcherobj.matches();
        return result;
    }
}

