package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class Passwordwith1upperCaseTest {
    @Test
    public void checking_password(){
        Password uppercase=new Password();
        Boolean result=uppercase.getPassword("Vaibhavp");
        assertTrue(result);
    }

}

