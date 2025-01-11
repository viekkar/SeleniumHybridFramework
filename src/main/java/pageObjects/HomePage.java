package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseComponents{

    WebDriver driver;

    //create constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }


    //create locators
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;

    //action methods

    public void clickMyAccount(){
        myAccount.click();
    }

    public void clickRegister(){
        register.click();
    }
}
