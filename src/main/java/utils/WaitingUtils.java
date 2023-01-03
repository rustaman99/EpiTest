package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetkaPages.BasePage;

import java.time.Duration;

public class WaitingUtils extends BasePage {
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20000));

    public WaitingUtils(WebDriver driver) {
        super(driver);
    }

    public WebElement waitElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public WebElement waitUntilElementVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement wait5Seconds(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        return element;
    }

    public WebElement wait20SecondsElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        return element;
    }
}