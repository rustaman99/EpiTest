package epicenterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilPhonePage extends BasePage{
    @FindBy(xpath = "//button[@data-card-params='5948322, ,1']")
    public WebElement buyButton;
    @FindBy(xpath = "//p[@class='summation-block__results'] ")
    public WebElement numberOfAddedItems;
    @FindBy(xpath = "  //a[@data-favorites='003265633'] ")
    public WebElement addingAFavorite;
    @FindBy(xpath = "  //*[contains(text(),'Смартфон Apple iPhone 14 128GB Purple (MPV03RX/A)')]")
    public WebElement goodsInDesires;
    @FindBy(xpath = "  //*[@class='header__whishes-link-icon']    ")
    public WebElement openGoodsInWishes;



    public MobilPhonePage(WebDriver driver) {
        super(driver);
    }
}
