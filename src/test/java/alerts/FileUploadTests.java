package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.fileUpload("C:\\Users\\csha0\\IdeaProjects\\SeleniumDemo\\resources\\chromedriver.exe");
        fileUploadPage.clickFileUpload();
        assertEquals(fileUploadPage.uploadedFile(),"chromedriver.exe","Incorrect file upload");
    }
}
