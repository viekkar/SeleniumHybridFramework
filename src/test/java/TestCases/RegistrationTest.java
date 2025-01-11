package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.Base;

public class RegistrationTest extends Base {


    @Test
    public void verifyRegistration(){
        HomePage homePage=new HomePage(driver);
        homePage.clickMyAccount();
        homePage.clickRegister();
        RegistrationPage registrationPage =new RegistrationPage(driver);
        registrationPage.setFirstName(getRandomString().toUpperCase());
        registrationPage.setLastName(getRandomString().toUpperCase());
        registrationPage.setEmail(getRandomString()+"@gmail.com");
        String password=getRandomString();
        registrationPage.setPhone(getRandomNumber());
        registrationPage.setFmyPassword(password);
        registrationPage.setmyConfirmation(password);
        registrationPage.checkBox();
        registrationPage.submit();
        Assert.assertEquals("Your Account Has Been Created!",registrationPage.getConfirmationMsg());
    }


}
