package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//программа логинится в фейсбук и находит надпись на картинке
public class Facebook {
        public static void main(String[] args) /*throws InterruptedException*/ {
            System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("ronpotato@ukr.net");
            driver.findElement(By.id("pass")).clear();
            driver.findElement(By.id("pass")).sendKeys("4587393t");
            driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
//            driver.findElement(By.className("_5z6m")).getText();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector(".g h3 a")).click();
            System.out.println(driver.getTitle());
            System.out.println(driver.findElement(By.className("_5z6m")).getText());
            System.out.println(driver.findElement(By.xpath("//span[@class='_5z6m']")).getText());
            driver.quit();
//        Thread.sleep(4000);

        }
    }

