package epicenter;

import epicenterPage.ChromeStartPage;
import epicenterPage.HomePage;
import epicenterPage.MacbookAirPage;
import epicenterPage.MobilPhonePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.*;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WaitingUtils;

import java.time.Duration;

public class BaseEpicenterTest {
 protected static final Logger log = Logger.getLogger(EpicenterTest.class);

    WebDriver driver;
   HomePage homePage;
    WaitingUtils waitingUtils;
    ChromeStartPage chromeStartPage;
  MobilPhonePage mobilPhonePage;
  MacbookAirPage macbookAirPage;
        @BeforeMethod
    public void before() {

//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        driver = new ChromeDriver();

          WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
        initPages();


    }

    public void initPages() {
  homePage=new HomePage(driver);
  waitingUtils=new WaitingUtils(driver);
  chromeStartPage=new ChromeStartPage(driver);
  mobilPhonePage=new MobilPhonePage(driver);
  macbookAirPage=new MacbookAirPage(driver);

    }

    @AfterMethod

    public void tearDown(){
     driver.quit();

    }
}