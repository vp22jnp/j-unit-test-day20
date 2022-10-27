package com.userregistration;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class UserEntryjunitTest {
    @Test
    public void checking_names(){
        FirstName name=new FirstName();
        Boolean result= name.getname("Vaibhav");
        assertTrue(result);
    }
    @Test
    public void checking_lastnames(){
        Lastname last=new Lastname();
        Boolean result= last.getlastname("Pathak");
        assertTrue(result);
    }
    @Test
    public void checking_phonenumber(){
        PhoneNumber number=new PhoneNumber();
        Boolean result= number.getphonenumber("8052433323");
        assertTrue(result);
    }
    @Test
    public void checking_password(){
        Password privacy=new Password();
        Boolean result=privacy.getPassword("VaibhavP");
        assertTrue(result);
    }
    @Test
    public void checking_email(){
        Email id=new Email();
        Boolean result= id.getEmail("vp22jnp@gmail.com");
        assertTrue(result);
    }

}