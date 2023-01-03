package rozetkaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends  BasePage {
    @FindBy(xpath = "//app-buy-button[@goods_id='318466339']")
    public
    WebElement iphoneAddingToCart;


    @FindBy(xpath = "//*[@_nghost-rz-client-c104]")
    public
    WebElement cartСheckOut;

    @FindBy(xpath = "//*[@class='button button_size_large button_color_green cart-receipt__submit ng-star-inserted']")
    public
    WebElement goToCheckout;

    @FindBy(xpath = "//a[text()=' Ноутбуки ']")
    public
    WebElement laptopsButton;

    @FindBy(xpath = " //*[@goods_id='282286938']")
    public
    WebElement laptopsAddingToCart;


    public ProductPage(WebDriver driver) {
        super(driver);
    }
}
