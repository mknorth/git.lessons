package lesson7part2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class KismiaLogin extends BrowserFactory {


        @Test
        @Parameters({"email", "password"})
        public void login(/*@Optional("kmaukr@gmail.com")*/ String email, /*@Optional("qwerty2")*/ String password) throws InterruptedException {
            driver.get("https://kismia.com");

            driver.findElement(By.cssSelector("#user-email")).clear();
            driver.findElement(By.cssSelector("#user-email")).sendKeys(email);
            driver.findElement(By.cssSelector("#user-password")).sendKeys(password);
//            Thread.sleep(1000);
//            driver.findElement(By.cssSelector("#user-password")).sendKeys(Keys.ENTER);


            driver.findElement(By.cssSelector(".submit")).click();
            Thread.sleep(5000);
            Assert.assertTrue(driver.getCurrentUrl().contains("https://kismia.com/u"),"Wrong Page:" + driver.getCurrentUrl());
        }

    }

