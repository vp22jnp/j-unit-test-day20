package com.userregistration;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserEntryjunit {
    public boolean getname(String name){
        String nameRegex=("^[A-Z]{1}[a-z]{2,10}$");
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(name);
        boolean result=matcherobj.matches();
        return result;
    }
    public boolean getlastname(String name){
    String nameRegex=("^[A-Z]{1}[a-z]{2,10}$");
    Pattern patternobj= Pattern.compile(nameRegex) ;
    Matcher matcherobj= patternobj.matcher(name);
    boolean result=matcherobj.matches();
        return result;
}
    public boolean getphonenumber(String phonenumber){
        String nameRegex=("^\\d{10}$");
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(phonenumber);
        boolean result=matcherobj.matches();
        return result;
    }
    public boolean getPassword(String password){
        String passwordRegex=("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Pattern patternobj= Pattern.compile(passwordRegex) ;
        Matcher matcherobj= patternobj.matcher(password);
        boolean result=matcherobj.matches();
        return result;
    }
    public boolean getEmail(String email){
        String nameRegex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern patternobj= Pattern.compile(nameRegex) ;
        Matcher matcherobj= patternobj.matcher(email);
        boolean result=matcherobj.matches();
        return result;
    }
}



