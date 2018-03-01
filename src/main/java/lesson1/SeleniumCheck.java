package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumCheck {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(5000);
        driver.quit();

    }
}
