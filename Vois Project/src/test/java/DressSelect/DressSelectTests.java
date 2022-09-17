package DressSelect;

import base.BaseTests;
import login.LoginTests;
import org.testng.annotations.Test;
import pages.DressSelectionPage;

import static org.testng.AssertJUnit.assertTrue;

public class DressSelectTests extends LoginTests {

    @Test
    public void testSuccessfulDressSelect(){
        //user should be logged in first to access this test
        //1st step Login
        testSuccessfulLogin();
        //then select the dress
        DressSelectionPage dressSelectionPage = homePage.clickDresses();
        dressSelectionPage.setSizeToLarge();
        dressSelectionPage.setColorToOrange();
        dressSelectionPage.clickAddToCart();
        dressSelectionPage.clickProceedToCheckout();
        dressSelectionPage.finishPayment();

        assertTrue(dressSelectionPage.getCheckoutConfirmationText().contains("Your order on My Store is complete."));
    }
}
