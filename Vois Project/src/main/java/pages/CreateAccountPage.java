package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CreateAccountPage {

    private WebDriver driver;
    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }

    private By genderField = By.id("id_gender1");

    private By firstNameField = By.id("customer_firstname");

    private By LastNameField = By.id("customer_lastname");
    private By passwordField = By.id("passwd");
    //Select day,month,year
    private By dayField = By.id("days");

    private By monthField = By.id("months");

    private By yearField = By.id("years");

    private By addressField = By.id("address1");

    private By cityField = By.id("city");

    private By stateField = By.id("id_state");

    private By postalCodeField = By.id("postcode");

    private By countryField = By.id("id_country");

    private By mobileNumberField = By.id("phone_mobile");

    private By registerButton = By.id("submitAccount");
    private By emailField = By.id("email_create");
    private By signUpButton = By.name("SubmitCreate");
    private By statusAlert = By.xpath("//*[@id=\"center_column\"]/p");

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void selectGender(){
        // wait 5 seconds for the page to load before selecting male gender
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(genderField).click();
    }

    public void setFirstName(String Name){
        driver.findElement(firstNameField).sendKeys(Name);
    }

    public void setLastName(String Name){
        driver.findElement(LastNameField).sendKeys(Name);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setBirthdate(String day,String month,String year){
        Select dateDay = new Select(driver.findElement(dayField));
        dateDay.selectByValue(day);

        Select dateMonth = new Select(driver.findElement(monthField));
        dateDay.selectByValue(month);

        Select dateYear = new Select(driver.findElement(yearField));
        dateDay.selectByValue(year);
    }

    public void setAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }

    public void setCity(String city){
        driver.findElement(cityField).sendKeys(city);
    }

    public void setState() {
        Select dateDay = new Select(driver.findElement(stateField));
        dateDay.selectByValue("5");
    }

    public void setPostalCode(String postal){
        driver.findElement(postalCodeField).sendKeys(postal);
    }

    public void setCountry() {
        Select country = new Select(driver.findElement(countryField));
        country.selectByValue("21");
    }

    public void setMobileNumber(String mobileNumber){
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
    }

    public void clickRegisterButton(){
        driver.findElement(registerButton).click();
    }

    public String getSignupConfirmationText() {
        return driver.findElement(statusAlert).getText();
    }
}