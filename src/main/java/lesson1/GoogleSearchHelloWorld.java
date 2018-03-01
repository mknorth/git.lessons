package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearchHelloWorld {

    public static void main(String[] args) /*throws InterruptedException*/ {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pdffiller.com/en/login.htm");
        driver.findElement(By.id("form-login-email")).clear();
        driver.findElement(By.id("form-login-email")).sendKeys("kravchuk.maksym@pdffiller.team!");
        driver.findElement(By.id("form-login-password")).clear();
        driver.findElement(By.id("form-login-password")).sendKeys("4587393t");
        driver.findElement(By.id("form-login-password")).sendKeys(Keys.ENTER);
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector(".g h3 a")).click();
        System.out.println(driver.getTitle());
        driver.quit();
//        Thread.sleep(4000);

    }
}