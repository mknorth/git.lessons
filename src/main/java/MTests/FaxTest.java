package MTests;
//тест на отправку файла через Fax
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FaxTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pdffiller.com/en/login.htm");
//        driver.get("https://denise.pdffiller.com/en/login.htm");
//        driver.get("https://dev3.pdffiller.com/en/login.htm");
        driver.findElement(By.xpath("//input[@id='form-login-email']")).clear();
        driver.findElement(By.xpath("//input[@id='form-login-email']")).sendKeys("kmaukr+1@gmail.com");
        driver.findElement(By.xpath("//input[@id='form-login-password']")).clear();
        driver.findElement(By.xpath("//input[@id='form-login-password']")).sendKeys("1");
        driver.findElement(By.xpath("//button[@id='form-login-submit']")).submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='mf-nav__cell mf-nav__cell--tabs']/div[1]")).click();
        driver.findElement(By.xpath("//ul[@class='mf-sb-actions-list']/li[5]")).click();
        //driver.findElement(By.xpath("//i[@class='i i-fax']")).submit();
//        driver.findElement(By.name("Fax")).click();
        //driver.get("https://www.pdffiller.com/en/export/fax.htm");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='ex_recipient_name']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='ex_recipient_company']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@class='ReactTags__tagInput']")).sendKeys("(209) 353-9052");
//        driver.findElement(By.xpath("//input[@class='ReactTags__tagInput']")).sendKeys("(312) 313-6544");
        driver.findElement(By.xpath("//input[@class='ReactTags__tagInput']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='g-btn g-btn-lg g-btn-primary g-btn-auto-width']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@class='g-btn g-btn--primary g-btn--auto-width']")).click();
        System.out.println(driver.getTitle());
    }
}
