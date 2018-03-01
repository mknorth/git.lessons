package homework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KismiaGameExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://kismia.com");

        driver.findElement(By.cssSelector("#user-email")).clear();
        driver.findElement(By.cssSelector("#user-email")).sendKeys("kmaukr@gmail.com");
        driver.findElement(By.cssSelector("#user-password")).sendKeys("qwerty2");
        driver.findElement(By.cssSelector(".submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='new-header-main-nav__link new-header-main-nav__link--matches']")));

        Assert.assertTrue(driver.getCurrentUrl().contains("https://kismia.com/u"),"Wrong Page:" + driver.getCurrentUrl());
        driver.findElement(By.cssSelector("[class='new-header-main-nav__link new-header-main-nav__link--matches']")).click();
        WebElement element = driver.findElement(By.cssSelector("[class='matches-game-age']"));
        String k = element.getText();
        int k1 = Integer.parseInt(k);

        if (k1<20 && k1>29){
            System.out.println("No no no It's Fail!!!");
        }


        driver.quit();
    }
}
