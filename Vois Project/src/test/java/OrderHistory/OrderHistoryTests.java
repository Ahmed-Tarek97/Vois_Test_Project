package OrderHistory;

import DressSelect.DressSelectTests;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.DressSelectionPage;
import pages.LoginPage;
import pages.OrderHistoryPage;

import static org.testng.AssertJUnit.assertTrue;

public class OrderHistoryTests extends DressSelectTests {

    @Test
    public void testOrderExistsInHistory(){
        //user should be logged in first and already bought an item
        //Step1: Login and buy item
        testSuccessfulDressSelect();
        //Step2: Check order history
        OrderHistoryPage orderHistoryPage = homePage.clickOrderHistory();
        assertTrue(orderHistoryPage.getConfirmationText().contains("Here are the orders you've placed since your account was created."));
    }
}