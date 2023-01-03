package rozetkaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChromeBasePage extends BasePage{
    @FindBy(xpath = "//input[@class='gLFyf']")
    public
    WebElement searchBox;

    @FindBy(xpath = "//*[contains(text(),'Интернет-магазин ROZETKA™: официальный сайт самого ...')]")
    public
    WebElement socketSelectionInResults;


    public ChromeBasePage(WebDriver driver) {
        super(driver);
    }
}
