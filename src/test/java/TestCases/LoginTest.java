package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.Base;

public class LoginTest extends Base {
    @Test
    public void verify_Login(){
        HomePage homePage=new HomePage(driver);
        homePage.clickMyAccount();
        homePage.clickLogin();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setEmail(properties.getProperty("myEmail"));
        loginPage.setPassword(properties.getProperty("myPass"));
        loginPage.submit();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(myAccountPage.isMyAccountExist(), "Login test passed");
        softAssert.assertAll();
        myAccountPage.setLogoutBtn();


    }
}
