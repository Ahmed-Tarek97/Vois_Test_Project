package Createaccount;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CreateAccountPage;

import static org.testng.AssertJUnit.assertTrue;

public class CreateAccountTests extends BaseTests {

    String email = "Testing.mail14@gmail.com";
    String firstName = "Ahmed";
    String lastName = "Elghazaly";
    String password = "Pass1234";
    String address = "10 Vois";
    String city = "Cairo";
    String postalCode = "10101";
    String mobileNumber = "0101010101010";



    @Test
    public void testSuccessfulAccountCreation(){
        //step1: Go to signup Page and enter new email
        CreateAccountPage createAccountPage = homePage.clickSignup();
        createAccountPage.setEmail(email);
        //step2: Go to account creation page
        createAccountPage = homePage.clickCreateAccount();
        //choose gender (Mr.)
        createAccountPage.selectGender();
        //enter first name
        createAccountPage.setFirstName(firstName);
        //enter last name
        createAccountPage.setLastName(lastName);
        //enter password
        createAccountPage.setPassword(password);
        //set address
        createAccountPage.setAddress(address);
        //set city
        createAccountPage.setCity(city);
        //set state (auto set)
        createAccountPage.setState();
        //set PostalCode
        createAccountPage.setPostalCode(postalCode);
        //set country (auto set)
        createAccountPage.setCountry();
        //set mobileNumber
        createAccountPage.setMobileNumber(mobileNumber);
        //click register
        createAccountPage.clickRegisterButton();
        assertTrue(createAccountPage.getSignupConfirmationText().contains("Welcome to your account."));
    }
}