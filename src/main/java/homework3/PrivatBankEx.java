package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Timestamp;

public class PrivatBankEx extends BrowserLogin{
    double aPrb2,aPrb3;
    double bPrb2,bPrb3;


    @Test
    public void prBank2() {

        driver.get("https://www.privat24.ua/#login");
        String usd = "USD:";
        String dol = "ДОЛ:";

        if (driver.findElement(By.xpath("//div[@class='container']/div[2]/span/strong[1]")).getText().equals(usd)){
            //System.out.println(driver.findElement(By.xpath("//div[@class='container']/div[2]/span/strong[1]")).getText());
            WebElement element2 = driver.findElement(By.xpath("//div[@class='container']/div[2]/span"));//div[@class='section'][1]/div[2]
            String str = element2.getText();
            //System.out.println(element.getText());

            String substr = "/";
            String substr2 = ":";

            String[] parts = str.split(substr);
            // String before = parts[0];
            String after = parts[1];
            String[] parts2 = parts[0].split(substr2);
            // String before2 = parts2[0];
            String after2 = parts2[1];
//        System.out.println("parts2 = " + after2);
            //System.out.println("parts2 = " + after2);
            aPrb2 = Double.parseDouble(after2);
            System.out.println(aPrb2);
            //System.out.println(after);
            String substr3 = "EUR";
            String[] part3 = after.split(substr3);
            String before3 = part3[0];
            //String after3 = part3[1];
//        System.out.println("before3: " + before3);

            bPrb2 = Double.parseDouble(before3);
            System.out.println(bPrb2);
        }else if (driver.findElement(By.xpath("//div[@class='section'][1]/div[1]")).getText().equals(dol)){
            WebElement element = driver.findElement(By.xpath("//div[@class='section'][1]/div[2]"));
            String str = element.getText();
            String substr = "/";
            String[] parts = str.split(substr);



            String before = parts[0];
            String after = parts[1];
            aPrb3 = Double.parseDouble(before);
            bPrb3 = Double.parseDouble(after);
            System.out.println(aPrb3 + " + " + bPrb3);
        }
//        else if (driver.findElement(By.xpath("//div[@class='section'][1]/div[1]")).getText() == "  ДОЛ:"){
//            WebElement element = driver.findElement(By.xpath("//div[@class='section'][1]/div[2]"));
//            String str = element.getText();
//            String substr = "/";
//            String[] parts = str.split(substr);
//            String before = parts[0];
//            String after = parts[1];
//            aPrb3 = Double.parseDouble(before);
//            bPrb3 = Double.parseDouble(after);
//            System.out.println(aPrb3 + " + " + bPrb3);
//        }
    }
}
