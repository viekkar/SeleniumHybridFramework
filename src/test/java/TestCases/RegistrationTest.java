package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.Base;

public class RegistrationTest extends Base {

    public HomePage homePage;
    RegistrationPage registrationPage;


    @Test
    public void verifyRegistration() {
        logger.info("**********Starting Resgistration Test***********");
        homePage = new HomePage(driver);
        homePage.clickMyAccount();
        logger.info("Clicked on My account");
        homePage.clickRegister();
        logger.info("Clicked on Registration");
        registrationPage = new RegistrationPage(driver);
        registrationPage.setFirstName(getRandomString().toUpperCase());
        registrationPage.setLastName(getRandomString().toUpperCase());
        registrationPage.setEmail(getRandomString() + "@gmail.com");
        String password = getRandomString();
        registrationPage.setPhone(getRandomNumber());
        registrationPage.setFmyPassword(password);
        registrationPage.setmyConfirmation(password);
        registrationPage.checkBox();
        registrationPage.submit();
        logger.info("Submitted registration");
        Assert.assertEquals("Your Account Has Been Created!", registrationPage.getConfirmationMsg());
    }


}
