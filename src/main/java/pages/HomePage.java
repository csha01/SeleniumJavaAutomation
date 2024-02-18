package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;


   public HomePage(WebDriver driver) {
       this.driver = driver;
   }

   public LoginPage clickFormAuthentication () {
           clickLink("Form Authentication");
           return new LoginPage(driver);
       }

       public DropDownPage clickDropDown(){
       clickLink("Dropdown");
       return new DropDownPage(driver);
       }

       public ForgotPasswordPage clickForgotPassword(){
       clickLink("Forgot Password");
       return new ForgotPasswordPage(driver);
       }

       public HoverPage clickHover(){
       clickLink("Hovers");
       return new HoverPage(driver);
       }

       public KeyPressPage clickKeyPress(){
       clickLink("Key Presses");
       return new KeyPressPage(driver);
       }

       public JSAlertPage clickJSAlert(){
       clickLink("JavaScript Alerts");
       return new JSAlertPage(driver);
       }

       public FileUploadPage clickFileUpload(){
       clickLink("File Upload");
       return new FileUploadPage(driver);
       }

       public WsiwygPage clickWsiwyg(){
       clickLink("WYSIWYG Editor");
       return new WsiwygPage(driver);
       }

       public DynamicLoadingPage clickDynamicLoading(){
       clickLink("Dynamic Loading");
       return new DynamicLoadingPage(driver);
       }

       public LargeAndDeepDomPage clickLargeAndDeep(){
       clickLink("Large & Deep DOM");
       return new LargeAndDeepDomPage(driver);
       }

       public InfiniteScrollPage clickInfiniteScroll(){
       clickLink("Infinite Scroll");
       return new InfiniteScrollPage(driver);
       }

       private void clickLink(String linkText){
       driver.findElement(By.linkText(linkText)).click();
       }

}
