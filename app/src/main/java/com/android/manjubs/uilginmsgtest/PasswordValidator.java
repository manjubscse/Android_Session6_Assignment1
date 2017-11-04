package com.android.manjubs.uilginmsgtest;


/**
 * Created by Jal on 22-08-2017.
 * Class for Passsword Validation
 */

public class PasswordValidator {

    public static boolean isValidPassword(String password)
    {
        // a null string is invalid
        if ( password == null )
            return false;

        // a string less than equal to 6 characters is invalid
        if ( password.length() <= 6 )
            return false;


        return true;
    }
}
