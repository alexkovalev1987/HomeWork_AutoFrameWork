package automationpracticeui.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "search_query_top")
    private WebElement searchInput;

    @FindBy(name = "submit_search")
    private WebElement searchSubmitButton;

    @FindBy(className = "login")
    private WebElement signinButton;

    @FindBy(css = "#contact-link")
    private WebElement contactButton;

    @FindBy(css = "#submitMessage")
    private WebElement submitMessegeButton;

    @FindBy
    private Select selectIdContact;

    @FindBy (css = "#email")
    private WebElement emailAddressInput;

    @FindBy (css = "#id_order")
    private WebElement idOrderInput;

    @FindBy (id = "fileUpload")
    private WebElement filenameInput;


    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchSubmitButton() {
        return searchSubmitButton;
    }

    public WebElement getSigninButton() {
        return signinButton;
    }

    public WebElement getContactButton() {
        return contactButton;
    }

    public WebElement getSubmitMessegeButton() {
        return submitMessegeButton;
    }

    public Select getSelectIdContact() {
        selectIdContact = new Select(driver.findElement(By.cssSelector("#id_contact")));
        return selectIdContact;
    }

    public WebElement getEmailAddressInput() {
        return emailAddressInput;
    }

    public WebElement getIdOrderInput() {
        return idOrderInput;
    }

    public WebElement getFilenameInput() {
        return filenameInput;
    }
}
