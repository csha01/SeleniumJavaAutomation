package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailField = By.id("email");
    private By retreivePassword = By.id("form_submit");


    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetreivePassword(){
        driver.findElement(retreivePassword).click();
        return new EmailSentPage(driver);

    }




}
