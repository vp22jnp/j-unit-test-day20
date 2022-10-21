package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordTest {
    @Test
    public void checking_password(){
        Password privacy=new Password();
        Boolean result=privacy.getPassword("VaibhavP");
        assertTrue(result);
    }

}

