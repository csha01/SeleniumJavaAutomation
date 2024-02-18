package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrameEditor(){
        var wsiwygPage = homePage.clickWsiwyg();
        wsiwygPage.clearTextArea();
        wsiwygPage.setTextArea("hello world");
        wsiwygPage.increaseIndentation();
        String editorText = wsiwygPage.getTextFromEditor();
        assertEquals(editorText,"hello world","Incorrect text");
    }
}
