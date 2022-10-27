package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailSamplesTest {
    @Test
    public void checking_emailSamples(){
        EmailSamples email=new EmailSamples();
        boolean result1 = email.getEmail("abc@yahoo.com");
        boolean result2 = email.getEmail("abc-100@yahoo.com,");
        boolean result3 = email.getEmail("abc.100@yahoo.com");
        boolean result4 = email.getEmail("abc111@abc.com,");
        boolean result5 = email.getEmail("abc-100@abc.net,");
        boolean result6 = email.getEmail(" abc.100@abc.com.au");
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertTrue(result4);
        assertTrue(result5);
        assertTrue(result6);
    }

}