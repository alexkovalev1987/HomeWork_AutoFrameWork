package uitest;

import org.testng.annotations.Test;

public class TestCustomerInput extends BaseTest {

    @Test (description = "86")
    void testCustomerInput() {
        mainPageSteps.clickContactButton();
        mainPageSteps.fillCustomerInput("1", "alexgomel1987@gmail.com","123",
                "D:\\New folder\\autotestid\\src\\main\\resources\\20-large_default.jpg");
        mainPageSteps.clickSubmitMessegeButton();
    }
}
