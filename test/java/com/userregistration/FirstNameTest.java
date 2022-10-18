package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNameTest {
    @Test
    public void checking_names(){
        FirstName name=new FirstName();
        Boolean result= name.getname("Vaibhav");
        assertTrue(result);
    }

}