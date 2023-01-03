package rozetka;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class RozetkaTest2 extends BaseTest {


    @Test(description = "Покупка Iphone 14")
    public void buyingAnIphone()  {

        homePage.searchGraph.sendKeys("iphone 13");
        homePage.searchGraph.sendKeys(Keys.ENTER);
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-buy-button[@goods_id='318466339']"))).click();
        //waitingUtils.waitElementToBeClickable(productPage.iphoneAddingToCart).click();
        productPage.cartСheckOut.click();
        productPage.goToCheckout.click();
        checkoutPage.lastNameInputLine.sendKeys("Степан");
        checkoutPage.nameInputLine.sendKeys("Бандера");
        checkoutPage.phoneInputLine.sendKeys("0508833772");
        Assert.assertEquals(checkoutPage.toPay.getText(), "50 999 ₴");
        Assert.assertTrue(checkoutPage.toPay.isDisplayed(), "to Pay isDisplayed");

    }

    @Test(description = "Проверка покупки ноутбука")
    public void buyingLaptop()  {
        waitingUtils.waitElementToBeClickable(homePage.laptopsAndComputers).click();
        waitingUtils.waitElementToBeClickable(productPage.laptopsButton).click();
        waitingUtils.waitElementToBeClickable(productPage.laptopsAddingToCart).click();
        productPage.cartСheckOut.click();
        waitingUtils.waitElementToBeClickable(productPage.goToCheckout).click();
        checkoutPage.lastNameInputLine.sendKeys("Степанов");
        checkoutPage.nameInputLine.sendKeys("Иван");
        checkoutPage.phoneInputLine.sendKeys("066774747474");
        Assert.assertFalse(checkoutPage.phoneInputLine.isSelected());
        Assert.assertTrue(checkoutPage.nameInputLine.isDisplayed());
        Assert.assertEquals(checkoutPage.phoneInputLine.getText(), "");
        Assert.assertEquals(checkoutPage.toPay.getText(), "29 999 ₴");
        Assert.assertEquals(checkoutPage.checkoutIphone.getText(), "Оформлення замовлення");
        checkoutPage.checkoutIphone.getText().equals("Оформлення замовлення");
    }

    @Test
    public void checkingTheCartThatThereIsNoAddedProduct()  {
        homePage.searchGraph.sendKeys("iphone 13");
        homePage.searchGraph.sendKeys(Keys.ENTER);
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-buy-button[@goods_id='318466339']"))).click();
        //waitingUtils.waitElementToBeClickable(productPage.iphoneAddingToCart).click();
        productPage.cartСheckOut.click();
        Assert.assertTrue(productPage.cartСheckOut.isDisplayed());


    }

    @Test

    public void checkTitleRozetka() {
        Assert.assertEquals("Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого онлайн-гіпермаркету в Україні", driver.getTitle());
        Assert.assertTrue(homePage.buttonSearch.isEnabled());
    }
    @Test
    public  void checkRegisterPage(){
        homePage.loginToPersonalAccount.click();
        waitingUtils.waitElementToBeClickable(homePage.registerButton).click();
        homePage.inputUserName.sendKeys("Руслан");
        homePage.inputUserSurname.sendKeys("Назаренко");
        homePage.inputUserPhone.sendKeys("506672722");
        homePage.inputUserEmail.sendKeys("boss.rustaman9@gmail.com");
        homePage.inputUserPassword.sendKeys("Rustaman99");
        homePage.buttonRegister.click();
        homePage.validationMessage.getText().equals("Користувач з телефоном 506672722 вже зареєстрований, введіть інший.");
    }
    @Test
    public void checkAccountLogin(){
            chromeBasePage.searchBox.sendKeys("Rozetka");
            chromeBasePage.searchBox.sendKeys(Keys.ENTER);
            chromeBasePage.socketSelectionInResults.click();
            homePage.loginToPersonalAccount.click();
            homePage.authEmailOrNumberPhone.sendKeys("+380506672722");
            homePage.authPass.sendKeys("Rustaman99");
            homePage.signInButton.click();
            WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10000));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
            homePage.signInButton.click();
        }
    }

