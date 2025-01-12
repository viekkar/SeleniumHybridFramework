package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class Base {
    public WebDriver driver;
    public Logger logger;
    public Properties properties;
    @BeforeClass
    @Parameters({"Browser"})
    public void setup(String browserName) throws IOException {
        properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("./src/test/resources/data.properties");
        properties.load(fileInputStream);
        logger= LogManager.getLogger();
        switch (browserName.toLowerCase())
        {
            case"chrome":driver=new ChromeDriver(); break;
            case"edge":driver=new EdgeDriver();break;
            default:
                System.out.println("browser not exist");
                return;
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(properties.getProperty("baseUrl"));
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
