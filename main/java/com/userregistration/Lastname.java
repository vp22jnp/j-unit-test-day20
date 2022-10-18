package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lastname {
    public boolean getlastname(String name){
        String nameRegex=("^[A-Z]{1}[a-z]{2,10}$");
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(name);
        boolean result=matcherobj.matches();
        return result;
    }
}

