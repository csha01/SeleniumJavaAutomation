package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;

public class FileUploadPage {

    private WebDriver driver;

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    private By uploadFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");

    private By uploadedFile = By.id("uploaded-files");

    public void clickFileUpload(){
        driver.findElement(uploadButton).click();
    }

    public void fileUpload(String absolutePathOfFile){
        driver.findElement(uploadFile).sendKeys(absolutePathOfFile);
        clickFileUpload();
    }

    public String uploadedFile(){
        return driver.findElement(uploadedFile).getText();
    }
}
