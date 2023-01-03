package rozetka;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import rozetkaPages.CheckoutPage;
import rozetkaPages.ChromeBasePage;
import rozetkaPages.HomePage;
import rozetkaPages.ProductPage;
import utils.WaitingUtils;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    HomePage homePage;
    CheckoutPage checkoutPage;
    ProductPage productPage;
    WaitingUtils waitingUtils;
    ChromeBasePage chromeBasePage;
    @BeforeMethod
    public void before() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("window-size=1200x600");
//       driver = new ChromeDriver(options);
        //  driver=new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/?hl=ru");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
        initPages();


    }

    public void initPages() {
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
        productPage = new ProductPage(driver);
        waitingUtils = new WaitingUtils(driver);
        chromeBasePage=new ChromeBasePage(driver);
    }

    @AfterMethod

    public void tearDown() throws IOException {
//        Date dateNow = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
//        String fileName = format.format(dateNow) + ".png";
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("//Users//rs//Desktop//Screenshot//" + fileName));
       driver.quit();

    }
}


