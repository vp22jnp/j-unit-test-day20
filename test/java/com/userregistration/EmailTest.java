package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {
    @Test
    public void checking_email(){
        Email id=new Email();
        Boolean result= id.getEmail("vp22jnp@gmail.com");
        assertTrue(result);
    }

}

