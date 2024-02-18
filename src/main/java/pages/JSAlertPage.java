package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {

    private WebDriver driver;

    public JSAlertPage(WebDriver driver){
        this.driver = driver;
    }

    private By alertTrigger = By.xpath("//button[text()='Click for JS Alert']");
    private By result = By.id("result");
    private  By triggerConfirm = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPrompt = By.xpath("//button[text()='Click for JS Prompt']");



    public void clickAlertTrigger(){
        driver.findElement(alertTrigger).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickTriggerConfirm(){
        driver.findElement(triggerConfirm).click();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }

    public void clickPromptTrigger(){
     driver.findElement(triggerPrompt).click();
    }

    public void alert_InputPrompt(String str){
        driver.switchTo().alert().sendKeys(str);
    }

    public void alert_PromptAccept(){
        driver.switchTo().alert().accept();
    }


    public String result(){
        return driver.findElement(result).getText();
    }
}
