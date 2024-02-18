package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void acceptALert(){
       var jsAlertPage =  homePage.clickJSAlert();
       jsAlertPage.clickAlertTrigger();
       jsAlertPage.acceptAlert();
       assertEquals(jsAlertPage.result(),"You successfully clicked an alert","Result text is incorrect");
    }

    @Test
    public void dismissAlert(){
        var jsAlertpage = homePage.clickJSAlert();
        jsAlertpage.clickTriggerConfirm();
       String text =  jsAlertpage.alert_getText();
        jsAlertpage.dismissAlert();
        assertEquals(text,"I am a JS Confirm","Incorrect alert text");

    }

    @Test
    public void testPromptAlert(){
        var jsAlertPage = homePage.clickJSAlert();
        jsAlertPage.clickPromptTrigger();
        jsAlertPage.alert_InputPrompt("chitransh");
        jsAlertPage.alert_PromptAccept();
        assertEquals(jsAlertPage.result(),"You entered: chitransh","Incorrect prompt entered");
    }
}
