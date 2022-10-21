package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneNumberTest {
    @Test
    public void checking_phonenumber(){
        PhoneNumber number=new PhoneNumber();
        Boolean result= number.getphonenumber("8052433323");
        assertTrue(result);
    }
}

