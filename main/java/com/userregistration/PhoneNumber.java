package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public boolean getphonenumber(String phonenumber){
        String nameRegex=("^\\d{10}$");
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(phonenumber);
        boolean result=matcherobj.matches();
        return result;
    }
}


