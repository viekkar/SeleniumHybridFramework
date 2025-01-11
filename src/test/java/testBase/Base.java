package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class Base {
    public WebDriver driver;
    public Logger logger;
    @BeforeClass
    public void setup(){
        logger= LogManager.getLogger();
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://tutorialsninja.com/demo/index.php");
        driver.manage().window().maximize();

    }


    public String getRandomString(){
        return RandomStringUtils.randomAlphabetic(6);
    }


    public String getRandomNumber(){
        return RandomStringUtils.randomNumeric(10);
    }

    public String getRandomPassword(){
        String stringValue=RandomStringUtils.randomAlphabetic(4);
        String numValue=RandomStringUtils.randomNumeric(4);
        return stringValue+numValue;

    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
