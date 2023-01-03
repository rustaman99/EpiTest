package epicenterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacbookAirPage extends BasePage{
    @FindBy(xpath = "//button[@data-card-params='6880159, 1,1']")
    public WebElement buyButtonMac6880159;

    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    public WebElement goBackButton;

    @FindBy(xpath = "//button[@data-card-params='6880161, 1,1']")
    public WebElement buyButtonMac6880161;

    @FindBy(xpath = "//span[@class='basket-purchase__send-sum--new'] ")
    public WebElement purchaseAmount;

    public MacbookAirPage(WebDriver driver) {
        super(driver);
    }
}
