package MTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://denise.pdffiller.com/en/login.htm");
        driver.findElement(By.xpath("//input[@id='form-login-email']")).clear();
        driver.findElement(By.xpath("//input[@id='form-login-email']")).sendKeys("kmaukr+1@gmail.com");
        driver.findElement(By.xpath("//input[@id='form-login-password']")).clear();
        driver.findElement(By.xpath("//input[@id='form-login-password']")).sendKeys("1");
        driver.findElement(By.xpath("//button[@id='form-login-submit']")).submit();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='mf-nav__cell mf-nav__cell--tabs']/div[1]")).click();
        driver.findElement(By.xpath("//ul[@class='mf-sb-actions-list']/li[3]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//form[@class='export-form-block export-form-tablet-max-width']/div[2]//input[@class='ReactTags__tagInput']")).clear();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//form[@class='export-form-block export-form-tablet-max-width']/div[2]//input[@class='ReactTags__tagInput']")).sendKeys("kmaukr@gmail.com");
        driver.findElement(By.xpath("//form[@class='export-form-block export-form-tablet-max-width']/div[2]//input[@class='ReactTags__tagInput']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='g-btn g-btn-lg g-btn-primary g-btn-auto-width']")).click();

        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }

}
