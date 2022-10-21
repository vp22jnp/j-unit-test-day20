package com.userregistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class Password1NumericTest {

    @Test
    public void getPasswordnumericcase() {
            Password1Numeric numeric=new Password1Numeric();
           Boolean result=numeric.getPasswordnumericcase("Vaibhav3");
            assertTrue(result);
        }

    }
