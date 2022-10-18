package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastnameTest {
    @Test
    public void checking_names(){
        FirstName name=new FirstName();
        Boolean result= name.getname("Pathak");
        assertTrue(result);
    }

}

