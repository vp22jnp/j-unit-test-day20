package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleEmailEntryTest {

    @Test
    public void getmultipleEmail() {
            Email id=new Email();
            Boolean result= id.getEmail("vp22jnp@gmail.com");
            boolean result1=id.getEmail("vp-22&jnp@gmail.com");
            assertTrue(result);
        }
    }
