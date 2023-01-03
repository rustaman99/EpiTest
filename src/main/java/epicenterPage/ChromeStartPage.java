package epicenterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChromeStartPage extends BasePage{
    @FindBy(xpath = "//input[@class='gLFyf']")
    public
    WebElement searchBox;

    @FindBy(xpath = "//*[contains(text(),'Епіцентр • Національна мережа торговельних центрів')]")
    public
    WebElement socketSelectionInResults;

    public ChromeStartPage(WebDriver driver) {
        super(driver);
    }
}
