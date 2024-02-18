package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace(){
       var keyPressPage =  homePage.clickKeyPress();
       keyPressPage.enterText("A"+ Keys.BACK_SPACE);
       assertEquals(keyPressPage.getResult(),"You entered: BACK_SPACE","Incorrect Key Press");
    }

    @Test
    public void testPi(){
        var keyPressPage = homePage.clickKeyPress();
        keyPressPage.enterPi();
    }

}
