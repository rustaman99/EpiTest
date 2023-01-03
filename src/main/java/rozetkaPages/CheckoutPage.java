package rozetkaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends BasePage {
    @FindBy(xpath = "//div[@class='form__row js-surname']//preceding-sibling::input")
    public WebElement lastNameInputLine;


    @FindBy(xpath = "//div[@class='form__row js-name']//preceding-sibling::input")
    public WebElement nameInputLine;

    @FindBy(xpath = "//input[@id='checkoutUserPhone']")
    public WebElement phoneInputLine;

    @FindBy(xpath = "//*[text()='Редактировать']")
    public WebElement editOrder;

    @FindBy(xpath = "//dd[@class='checkout-total__value checkout-total__value_size_large']")
    public WebElement toPay;

    @FindBy(xpath = "//input[@value='Заказ подтверждаю']")
    public WebElement confirmTheOrder;

    @FindBy(xpath = "//h1[@class='checkout-heading ng-star-inserted']")
    public WebElement checkoutIphone;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
}
