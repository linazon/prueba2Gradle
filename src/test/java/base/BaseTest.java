package base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    private WebDriver chromeDriver;
    protected HomePage homePageChrome;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        homePage();
        homePageChrome = new HomePage(chromeDriver);
    }

    @BeforeEach
    public void homePage(){
        chromeDriver.get("http://automationpractice.com/index.php");
    }

    @AfterAll
    public void tearDown(){
        chromeDriver.quit();
    }
}
