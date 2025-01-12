package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseComponents{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement submit;


    public void setEmail(String emailId){
        email.sendKeys(emailId);
    }

    public void setPassword(String emailPassword){
        password.sendKeys(emailPassword);
    }

    public void submit(){
        submit.click();
    }
}
