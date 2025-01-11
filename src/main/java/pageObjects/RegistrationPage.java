package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BaseComponents{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephone;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmation;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement checkbox;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement submit;

    @FindBy(xpath = "//*[@id='content']/h1")
    WebElement msgConfirmation;


    public void setFirstName(String myFname){
        firstName.sendKeys(myFname);
    }

    public void setLastName(String myLname){
        lastName.sendKeys(myLname);
    }


    public void setEmail(String myEmail){
        email.sendKeys(myEmail);
    }


    public void setPhone(String myPhone){
        telephone.sendKeys(myPhone);
    }


    public void setFmyPassword(String myPassword){
        password.sendKeys(myPassword);
    }


    public void setmyConfirmation(String myConfirmation){
        confirmation.sendKeys(myConfirmation);
    }


    public void checkBox(){
        checkbox.click();
    }

    public void submit(){
        submit.click();
    }

    public String getConfirmationMsg(){
        try{
            return msgConfirmation.getText();
        } catch (Exception e) {
            return e.getMessage();
        }
    }



}
