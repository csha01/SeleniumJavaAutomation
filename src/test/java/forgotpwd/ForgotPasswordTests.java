package forgotpwd;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("tauexample.com");
        var emailSentPage =  forgotPasswordPage.clickRetreivePassword();
        assertEquals(emailSentPage.getEmailText(),"Internal Server Error","Message is incorrect");
    }

}
