package com.akashdubey.testigndemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    String email ="dubey.akash1@gmail.com";
    String pass="abc123";

    @Test
    public void checkEmail(){
        assertEquals("Username failure","dubey.akash1@gmail.com",email);
    }

    @Test
    public void checkPassword(){
        assertEquals("Password failure","abc123",pass);
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}