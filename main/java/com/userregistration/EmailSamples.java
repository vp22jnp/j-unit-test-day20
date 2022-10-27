package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSamples {
    public boolean getEmail(String email){
        String nameRegex="^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$";
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(email);
        boolean result=matcherobj.matches();
        return result;
    }
}
