package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicExample1Page {

    private WebDriver driver;

    public DynamicExample1Page(WebDriver driver){
        this.driver = driver;
    }

    private By startButton = By.xpath("//button[text()='Start']");
    private By loading = By.id("loading");
    private By finish = By.id("finish");

    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }

    public String getLoadedText(){
        return driver.findElement(finish).getText();
    }


}
