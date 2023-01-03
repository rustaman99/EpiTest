package epicenter;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class EpicenterTest extends BaseEpicenterTest {
//  private static final Logger log = Logger.getLogger(EpicenterTest.class);

    @Test(description = "Проверка входа в личный кабинет")
    public void accountLogin() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99!");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.nameUser).click();
        Assert.assertEquals(homePage.inscriptionMyOffice.getText(), "Мій кабінет");
       log.info("Текст информации");
       log.warn("error");

    }

    @Test(description = "Добавление товара в корзину")
    public void addingAProductToTheCart() throws InterruptedException {
        driver.get("https://www.google.com.ua/");

        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99!");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.searchString).sendKeys("Iphone 14");
        homePage.searchString.sendKeys(Keys.ENTER);
        mobilPhonePage.buyButton.click();
        Assert.assertEquals(mobilPhonePage.numberOfAddedItems.getText(), "Загалом 1 товар на суму");
       log.warn("warning");
    }
    @Test
     public void hh() throws InterruptedException {
        driver.get("https://www.google.com.ua/");

        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99!");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.basketButton).click();
        homePage.deleteAlProducts.click();
        homePage.confirmationOfDeletionOfGoodsDeleteAlProducts.click();
        macbookAirPage.goBackButton.click();
        log.error("error");
    }


    @Test(description = "Проверка на добавление товара в избраное ")
    public void checkForAddingAProductToFavorites() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys("Rustaman99!");
        homePage.loginButton.click();
        waitingUtils.wait5Seconds(homePage.searchString).sendKeys("Iphone 14");
        homePage.searchString.sendKeys(Keys.ENTER);
        mobilPhonePage.addingAFavorite.click();
        waitingUtils.wait5Seconds(mobilPhonePage.openGoodsInWishes).click();
        Assert.assertTrue(mobilPhonePage.goodsInDesires.isDisplayed());
        log.error("error");
    }

    @DataProvider
    public Object[][] nam() {
        return new Object[][]{
                {"Ivan"},
                {"Stepan"},
                {"Borus"}
        };
    }
    @Test(description = "сравнение суммы  при добавлении 2х товаров в корзину ",dataProvider = "nam")
    public void comparisonOfTheAmountWhenAdding2ItemsToTheCart(String st) throws InterruptedException {

        driver.get("https://www.google.com.ua/");
        chromeStartPage.searchBox.sendKeys("Epicenter");
        chromeStartPage.searchBox.sendKeys(Keys.ENTER);
        chromeStartPage.socketSelectionInResults.click();
        homePage.loginToPersonalAccount.click();
        homePage.userLogin.sendKeys("+380506672722");
        homePage.userPass.sendKeys(st);
        homePage.loginButton.click();
        // waitingUtils.wait5Seconds(homePage.basketButton).click();
//        homePage.deleteAlProducts.click();
//        homePage.confirmationOfDeletionOfGoodsDeleteAlProducts.click();
//        macbookAirPage.goBackButton.click();
        waitingUtils.wait5Seconds(homePage.searchString).sendKeys("macbook air");
        homePage.searchString.sendKeys(Keys.ENTER);
        macbookAirPage.buyButtonMac6880159.click();
        macbookAirPage.goBackButton.click();
        macbookAirPage.buyButtonMac6880161.click();
        Assert.assertEquals(macbookAirPage.purchaseAmount.getText(), "109 998 ₴");
        log.error("error");
    }
   @DataProvider
    public Object[][] name() {
       return new Object[][]{
               {"Ivan"},
               {"Stepan"},
               {"Botus"},
               {"Borus"},
               {"Dam"}
       };
   }
        @Test(dataProvider = "name")
                public void test(String n){
            System.out.println("Hello " + n);
            log.info("info");
    }

}