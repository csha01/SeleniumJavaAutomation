package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By password = By.id("passwordd");

    private By userName = By.xpath("//div//input[@name='username']");

    private By login = By.cssSelector("#login button");

    public void setUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void setPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(login).click();
        return new SecureAreaPage(driver);
    }





}
