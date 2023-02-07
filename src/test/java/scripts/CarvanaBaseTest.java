package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CarvanaBasePage;
import utilities.ConfigReader;
import utilities.Driver;

public class CarvanaBaseTest {

    CarvanaBaseTest carvanaBaseTest;
    CarvanaBasePage carvanaBasePage;
    CarvanaTestCases carvanaTestCases;
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        carvanaBaseTest = new CarvanaBaseTest();
        carvanaBasePage = new CarvanaBasePage();
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));

    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }



}
