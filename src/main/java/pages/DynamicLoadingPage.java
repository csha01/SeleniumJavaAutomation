package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    private By example1 = By.xpath("//a[contains(text(),'Example 1')]");
    private By example2 = By.xpath("//a[contains(text(),'Example 2')]");

    public DynamicExample1Page clickExample1(){
        driver.findElement(example1).click();
        return new DynamicExample1Page(driver);
    }
}
