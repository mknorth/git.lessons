package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namefounder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver dri = new ChromeDriver();
        dri.get("https://docs.google.com/presentation/d/1Epf_2HQ86EgQFkqiB3zz2Uq08MkDlDCmU7poR-0-brs/edit#slide=id.p");
        System.out.print(dri.findElement(By.id("editor-g1025d2f9cf_0_283")).getText());
//        System.out.print(dri.findElement(By.xpath("//*[id='editor-g1025d2f9cf_0_283']")).getText());
        dri.quit();
    }
}
