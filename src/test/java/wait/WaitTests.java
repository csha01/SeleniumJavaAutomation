package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
      var dynaPage =  homePage.clickDynamicLoading();
     var example1Page =  dynaPage.clickExample1();
     example1Page.clickStart();
     assertEquals(example1Page.getLoadedText(),"Hello World!","Incorrect Text");
    }
}
