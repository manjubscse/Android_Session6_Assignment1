package com.android.manjubs.uilginmsgtest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    //Testcase for Email id
    @Test
    public void email_isCorrect() throws Exception {
        assertTrue(EmailAddressValidator.isValidEmailAddress("abc.def@gmail.com"));
    }

    //Testcase for Password
    @Test
    public void password_isCorrect() throws Exception {
        assertTrue(PasswordValidator.isValidPassword("123456@abc"));
    }
}