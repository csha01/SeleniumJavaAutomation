package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    private By textBlocks = By.className("jscroll-added");


    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0,document.body.scrollHeight)";
       var jsExecutor =  (JavascriptExecutor)driver;

       while(numberOfParagraphsPresent() < index){
           jsExecutor.executeScript(script);
       }
    }

    private int numberOfParagraphsPresent(){
        return driver.findElements(textBlocks).size();
    }
}
