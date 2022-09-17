package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressSelectionPage {

    private WebDriver driver;

    private By addToCartField = By.xpath("//*[@id=\"add_to_cart\"]/button/span");

    private By proceedToCheckoutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i");

    private By statusAlert = By.xpath("//*[@id=\"center_column\"]/div/p");

    public DressSelectionPage(WebDriver driver){
        this.driver = driver;
    }
        public void setSizeToLarge(){
            Select size = new Select(driver.findElement(By.id("group_1")));
            size.selectByValue("3");
        }
        public void setColorToOrange(){
             driver.findElement(By.id("color_13")).click();
        }
        public void clickAddToCart(){
             driver.findElement(addToCartField).click();
        }
         public void clickProceedToCheckout() {
             WebDriverWait wait = new WebDriverWait(driver, 10);
             //wait until proceed to checkout appears
             wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutButton));
             driver.findElement(proceedToCheckoutButton).click();
    }
    public void finishPayment() {
        // proceed until payment is confirmed (include choosing payment method)
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        //agree to the terms
        driver.findElement(By.id("cgv")).click();
        //click proceed
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
        //click pay by bank wire
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        //click I confirm
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
    }
    public String getCheckoutConfirmationText(){
        return driver.findElement(statusAlert).getText();
    }
}