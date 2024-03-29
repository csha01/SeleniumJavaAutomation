package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    private By contentMessage = By.xpath("//h1[text()='Internal Server Error']");

    public String getEmailText(){
        return   driver.findElement(contentMessage).getText();
    }
}
