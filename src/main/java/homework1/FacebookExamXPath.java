package homework1;
//логинит на Фейсбук и выводит титул и надпись на загруженной картинке

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExamXPath {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.facebook.com/");
        dr.findElement(By.xpath("//input[@id='pass']")).clear();
        dr.findElement(By.xpath("//input[@id='email']")).sendKeys("ronpotato@ukr.net");
        dr.findElement(By.xpath("//input[@id='pass']")).clear();
        dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("4587393t");

       // dr.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
        //сделал без sendKey, а через нажатие кнопки логина
//        WebElement loginButton = dr.findElement(By.xpath("//label[@id='loginbutton']"));
//        loginButton.click();
        //сокращенная форма записи WebElement(click())
        //dr.findElement(By.xpath("//label[@id='loginbutton']")).click();
//        //вроде бы лучше чем метод click так как ничего не принимает и не отдает
//        WebElement loginButton = dr.findElement(By.xpath("//label[@id='loginbutton']"));
//        loginButton.submit();


        //сокращенная форма записи WebElement(submit())
        dr.findElement(By.xpath("//label[@id='loginbutton']")).submit();
        System.out.println(dr.getTitle());
        System.out.println(dr.getCurrentUrl());
        //System.out.println(dr.getPageSource());// добавля

        System.out.println(dr.findElement(By.xpath("//span[@class='_5z6m']")).getText());
        dr.quit();
    }
}
