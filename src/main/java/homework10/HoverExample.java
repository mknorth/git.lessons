package homework10;

import homework3.BrowserLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverExample extends BrowserLogin {
    @Test
    public void lalall() throws InterruptedException {

        driver.get("http://www.imdb.com/");
        WebElement elem = driver.findElement(By.cssSelector("#consumer_main_nav #navTitleMenu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elem).perform();
        Thread.sleep(5000);

//        ((JavascriptExecutor) driver).executeScript( "window.open('http://www.imdb.com/','sdfdsf')");
        //driver.get("http://www.imdb.com/");
        WebElement elem2 = driver.findElement(By.cssSelector("#consumer_main_nav #navNameMenu"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(elem2).perform();
        Thread.sleep(5000);
    }

}
