package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExampleXPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver dr = new ChromeDriver();//инициализация браузера
        dr.get("https://www.facebook.com/");
        dr.findElement(By.xpath("//input[@id='pass']")).clear();
        dr.findElement(By.xpath("//input[@id='email']")).sendKeys("ronpotato@ukr.net");
        dr.findElement(By.xpath("//input[@id='pass']")).clear();
        dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("4587393t");
        dr.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
        System.out.println(dr.getTitle());
//        dr.quit();

    }
}
