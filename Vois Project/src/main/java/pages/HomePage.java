package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickLogin(){
        driver.findElement(By.className("header_user_info")).click();
        return new LoginPage(driver);
    }

    public CreateAccountPage clickSignup() {
        // click signup to go to Signup Page
        driver.findElement(By.className("header_user_info")).click();
        return new CreateAccountPage(driver);
    }
    public CreateAccountPage clickCreateAccount() {
        //on signup page, click create account to go to create account page
        driver.findElement(By.name("SubmitCreate")).click();
        return new CreateAccountPage(driver);
    }
    public DressSelectionPage clickDresses(){
        //click dresses
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        //select summer dresses
        driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[3]/h5/a")).click();
        //click on the product
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
        return new DressSelectionPage(driver);
    }

    public OrderHistoryPage clickOrderHistory(){
        //click on account name to go to account page
        driver.findElement(By.className("account")).click();
        //click on order history
        driver.findElement(By.className("icon-list-ol")).click();
        return new OrderHistoryPage(driver);
    }
}