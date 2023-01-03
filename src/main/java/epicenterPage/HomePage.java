package epicenterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//span[text()='Увійти']")
    public
    WebElement loginToPersonalAccount;

    @FindBy(xpath = "//input[@id='user_login']")
    public
    WebElement userLogin;

    @FindBy(xpath = "//input[@id='user_pass']")
    public
    WebElement userPass;

    @FindBy(xpath = "//button[@class='btn btn--blue ']")
    public
    WebElement loginButton;

    @FindBy(xpath = "//span[@class='header__cart-icon']  ")
    public
    WebElement   basketButton;

    @FindBy(xpath = "//a[@id='js-trigger-del']")
    public
    WebElement deleteAlProducts;

    @FindBy(xpath = "//button[@class='btn btn--white']")
    public
    WebElement confirmationOfDeletionOfGoodsDeleteAlProducts;


    @FindBy(xpath = "//span[@class='header__login-opener-text'] ")
     public
     WebElement   nameUser;



    @FindBy(xpath = "//h1[@class='headline headline--level2-bold user-profile__header-title']")
    public
    WebElement   inscriptionMyOffice;


    @FindBy(xpath = "//input[@type='text']")
    public
    WebElement   searchString;



    public HomePage(WebDriver driver) {
        super(driver);
    }
}
