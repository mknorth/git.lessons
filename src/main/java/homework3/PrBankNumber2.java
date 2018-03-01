package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PrBankNumber2 extends BrowserLogin {
    double averagePurchase;
    double averageSele;

    double aPrb,aPrb2,aUkrSib,strAval12,strOB1;
    double bPrb,bPrb2,bUkrSib,strAval22,strOB2;
    double str;

    double x,x2,y,y2,z,z2;

@Test
    public void prBank() {

        driver.get("https://www.privat24.ua");
        String usd = "USD:";
        String dol = "ДОЛ:";


        if (driver.findElement(By.xpath("//div[@class='section'][1]/div[1]")).getText().equals(dol)) {
            WebElement element = driver.findElement(By.xpath("//div[@class='section'][1]/div[2]"));
            String str = element.getText();
            String substr = "/";
            String[] parts = str.split(substr);
            String before = parts[0];
            String after = parts[1];
            aPrb = Double.parseDouble(before);
            bPrb = Double.parseDouble(after);
        } else {

            WebElement element2 = driver.findElement(By.xpath("//div[@class='container']/div[2]/span"));//div[@class='section'][1]/div[2]
            String str = element2.getText();

            String substr = "/";
            String substr2 = ":";
            String substr3 = "EUR";

            String[] parts = str.split(substr);
            String after = parts[1];

            String[] parts2 = parts[0].split(substr2);
            String after2 = parts2[1];
            aPrb = Double.parseDouble(after2);
            //System.out.println(aPrb);

            String[] part3 = after.split(substr3);
            String before3 = part3[0];
            bPrb = Double.parseDouble(before3);
            //System.out.println(bPrb)
        }

    }
}