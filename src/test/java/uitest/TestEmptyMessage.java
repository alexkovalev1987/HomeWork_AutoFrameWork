package uitest;

import org.testng.annotations.Test;

public class TestEmptyMessage extends BaseTest {

    @Test (description = "85")
    void testEmptyMessage (){
        mainPageSteps.clickContactButton();
        mainPageSteps.clickSubmitMessegeButton();
    }
}
