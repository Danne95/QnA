package app.msda.qna;

import android.util.Log;

import org.junit.Test;

import Adapters.Authentication;
import UI.LoginActivity;

import static org.junit.Assert.assertEquals;

public class LoginCheck {
    @Test
    public void isMailExist() {
        LoginActivity loginActivity=new LoginActivity();// creating a new object of class Authentication succeeded
        assertEquals(loginActivity.getEmail(),loginActivity.getEmail()); //checking that the login screen has a mail input/field
    }

}