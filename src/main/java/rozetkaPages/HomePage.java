package rozetkaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {


    @FindBy(xpath = "//input[@name='search']")
    public
    WebElement searchGraph;


    @FindBy(xpath = "//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")
    public
    WebElement buttonSearch;


    @FindBy(xpath = "//*[@class='menu-categories menu-categories_type_main']//li[1]")
    public
    WebElement laptopsAndComputers;

    @FindBy(xpath = "//*[@href='#icon-user-simple']")
    public
    WebElement loginToPersonalAccount;

    @FindBy(xpath = "  //input[@id='auth_email']")
    public
    WebElement authEmailOrNumberPhone;


    @FindBy(xpath = "  //input[@id='auth_pass']")
    public
    WebElement authPass;

    @FindBy(xpath = "  //button[@class='button button--large button--green auth-modal__submit ng-star-inserted']")
    public
    WebElement signInButton;

    @FindBy(xpath = " //div[@class='recaptcha-checkbox-border']")
    public
    WebElement confirmationThatItIsNotARobot;






    @FindBy(xpath = "//button[@class='auth-modal__register-link button button--link ng-star-inserted']")
    public
    WebElement registerButton;

    @FindBy(xpath = "//input[@id='registerUserName']")
    public
    WebElement inputUserName;

    @FindBy(xpath = "//input[@id='registerUserSurname']")
    public
    WebElement inputUserSurname;

    @FindBy(xpath = "//input[@id='registerUserPhone']")
    public
    WebElement inputUserPhone;

    @FindBy(xpath = "//input[@id='registerUserEmail']")
    public
    WebElement inputUserEmail;

    @FindBy(xpath = "//input[@id='registerUserPassword']")
    public
    WebElement inputUserPassword;

    @FindBy(xpath = " //button[@class='button button--large button--green auth-modal__submit']")
    public
    WebElement buttonRegister;

    @FindBy(xpath = "//p[@class='validation-message ng-star-inserted']")
    public
    WebElement validationMessage;

    public HomePage(WebDriver driver) {
        super(driver);


    }

}
