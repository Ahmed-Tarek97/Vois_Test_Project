package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderHistoryPage {

    private WebDriver driver;

    private By statusAlert = By.xpath("//*[@id=\"center_column\"]/p");

    public OrderHistoryPage(WebDriver driver){
        this.driver = driver;
    }

         public String getConfirmationText() {
                 return driver.findElement(statusAlert).getText();
    }
}