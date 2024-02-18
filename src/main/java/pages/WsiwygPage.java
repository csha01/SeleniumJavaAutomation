package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WsiwygPage {

    private WebDriver driver;

    public WsiwygPage(WebDriver driver){
        this.driver = driver;
    }

    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath("//button[@title='Increase indent']");

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void increaseIndentation(){
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
