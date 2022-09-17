package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By loginButton = By.id("SubmitLogin");

    private By statusAlert = By.xpath("//*[@id=\"center_column\"]/p");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String username){
        driver.findElement(emailField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public String getLoginConfirmationText(){
            return driver.findElement(statusAlert).getText();
    }
}