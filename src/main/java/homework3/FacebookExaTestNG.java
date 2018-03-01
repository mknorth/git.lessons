package homework3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookExaTestNG extends BrowserLogin {


    @Test
    public void facebookLogin(){

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='pass']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ronpotato@ukr.net");
        driver.findElement(By.xpath("//input[@id='pass']")).clear();
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("4587393t");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
        System.out.println("GetTitle: " + driver.getTitle());
    }


}
