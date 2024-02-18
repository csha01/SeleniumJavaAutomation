package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        var largeAndDeep = homePage.clickLargeAndDeep();
        largeAndDeep.scrollToTable();
    }

    @Test
    public void testScrollToFifthPage(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
