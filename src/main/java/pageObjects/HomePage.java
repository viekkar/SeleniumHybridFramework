package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseComponents{

    //create constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }


    //create locators
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccount;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement register;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement login;

    //action methods

    public void clickMyAccount(){
        myAccount.click();
    }

    public void clickRegister(){
        register.click();
    }

    public void clickLogin() {
        login.click();
    }
}
