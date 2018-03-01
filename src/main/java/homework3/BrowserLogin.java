package homework3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserLogin {

    public WebDriver driver;
    public WebDriver element2;

    @BeforeTest
    public void SetUp(){
        driver = new ChromeDriver();
    }


//    @AfterGroups(groups = "tD")
//    public void BankEX2(){
//        BanksExample bx = new BanksExample();
//
//        bx.averagePurchase = (bx.aPrb + bx.aUkrSib + bx.strAval12 + bx.strOB1)/4;
//        bx.averageSele = (bx.bPrb + bx.bUkrSib + bx.strAval22 + bx.strOB2)/4;
//
//        Double[] doubleArr1 = {bx.aPrb,bx.aUkrSib,bx.strAval12,bx.strOB1};
//        double minArr1 = doubleArr1[0];
//        for(Double value1 : doubleArr1) {
//            if (value1 < minArr1) {
//                minArr1 = value1;
//            }
//        }
//
//        Double[] doubleArr2 = {bx.bPrb,bx.bUkrSib,bx.strAval22,bx.strOB2};
//        double maxArr2 = doubleArr2[0];
//        for(Double value2 : doubleArr2) {
//            if (value2 > maxArr2) {
//                maxArr2 = value2;
//            }
//        }
//
//
//        if (minArr1 == bx.aPrb) {
//            System.out.println("Минимальное цена продажи Доллара в ПриватБанке: " + minArr1);
//        } else if (minArr1 == bx.aUkrSib){
//            System.out.println("Минимальное цена продажи Доллара в Укрсибе: " + minArr1);
//        } else if (minArr1 == bx.strAval12){
//            System.out.println("Минимальное цена продажи Доллара в Райфайзен: " + minArr1);
//        } else {
//            System.out.println("Минимальное цена продажи Доллара в ОщадБанке: " + minArr1);
//        }
//        if (maxArr2 == bx.bPrb) {
//            System.out.println("Максимальное цена покупки Доллара в ПриватБанке: " + maxArr2);
//        } else if (maxArr2 == bx.bUkrSib){
//            System.out.println("Максимальное цена покупки Доллара в Укрсибе: " + maxArr2);
//        } else if (maxArr2 == bx.strAval22){
//            System.out.println("Максимальное цена покупки Доллара в Райфайзен: " + maxArr2);
//        } else {
//            System.out.println("Максимальное цена покупки Доллара в ОщадБанке: " + maxArr2);
//        }
//
//        System.out.println("Среднее покупка по банкам: " + bx.averagePurchase);
//        System.out.println("Среднее продажа по банкам: " + bx.averageSele);
//    }

    @AfterTest
    public void BankEX(){
//        BanksExample gp = new BanksExample();
//
//        gp.averagePurchase = (gp.aPrb + gp.aUkrSib + gp.strAval12 + gp.strOB1)/4;
//        gp.averageSele = (gp.bPrb + gp.bUkrSib + gp.strAval22 + gp.strOB2)/4;
//
//        System.out.println("Среднее покупка по банкам: " + gp.averagePurchase);
//        System.out.println("Среднее покупка по банкам: " + gp.averageSele);

        driver.quit();

    }
}
