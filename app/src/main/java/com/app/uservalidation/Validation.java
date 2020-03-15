package com.app.uservalidation;

import android.util.Patterns;
import android.widget.EditText;

import java.util.regex.Pattern;

public class Validation {
    /*
    Check UserName
     */
//    private boolean validateUsername(EditText textInputUsername) {
//        String usernameInput = textInputUsername.getText().toString().trim();
//
//        if (usernameInput.isEmpty()) {
//            textInputUsername.setError("Field can't be empty");
//            return false;
//        } else if (usernameInput.length() > 15) {
//            textInputUsername.setError("Username too long");
//            return false;
//        } else {
//            textInputUsername.setError(null);
//            return true;
//        }
//    }

    /*
    Check Password
     */
//    private boolean validatePassword(EditText textInputPassword) {
//        String passwordInput = textInputPassword.getEditText().getText().toString().trim();
//
//        if (passwordInput.isEmpty()) {
//            textInputPassword.setError("Field can't be empty");
//            return false;
//        } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
//            textInputPassword.setError("Password too weak");
//            return false;
//        } else {
//            textInputPassword.setError(null);
//            return true;
//        }
//    }

    /*
    To Check Password Password Pattern
     */
    public final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{4,}" +               //at least 4 characters
                    "$");


    /*
    Check Email
     */
//    private boolean validateEmail() {
//        String emailInput = textInputEmail.getText().toString().trim();
//
//        if (emailInput.isEmpty()) {
//            textInputEmail.setError("Field can't be empty");
//            return false;
//        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
//            textInputEmail.setError("Please enter a valid email address");
//            return false;
//        } else {
//            textInputEmail.setError(null);
//            return true;
//        }
//    }


}//END
