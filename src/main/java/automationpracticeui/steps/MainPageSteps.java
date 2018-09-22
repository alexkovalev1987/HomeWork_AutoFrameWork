package automationpracticeui.steps;

import automationpracticeui.objects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPageSteps {

    private MainPage mainPage;
    protected WebDriver driver;

    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
        this.mainPage = PageFactory.initElements(driver, MainPage.class);

    }
    public void search(String searchQuery) {
        mainPage.getSearchInput().clear();
        mainPage.getSearchInput().sendKeys(searchQuery);
        mainPage.getSearchSubmitButton().click();
    }

    public LoginPageSteps clickSigninButton(){
        mainPage.getSigninButton().click();
        return new LoginPageSteps(driver);
    }

    public void clickContactButton(){
        mainPage.getContactButton().click();
    }

    public void  clickSubmitMessegeButton(){
        mainPage.getSubmitMessegeButton().click();
    }

    public void fillCustomerInput(String idContact, String email, String idOrder, String filename) {
        mainPage.getSelectIdContact().selectByValue(idContact);
        mainPage.getEmailAddressInput().clear();
        mainPage.getEmailAddressInput().sendKeys(email);
        mainPage.getIdOrderInput().clear();
        mainPage.getIdOrderInput().sendKeys(idOrder);
        mainPage.getFilenameInput().clear();
        mainPage.getFilenameInput().sendKeys(filename);
    }

}
