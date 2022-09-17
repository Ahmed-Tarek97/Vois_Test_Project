package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTests {

    String email = "Testing.mail14@gmail.com";
    String password = "Pass1234";

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        assertTrue(loginPage.getLoginConfirmationText().contains("Welcome to your account."));
    }
}