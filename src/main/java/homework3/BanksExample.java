package homework3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

import java.io.Console;
import java.text.DecimalFormat;


public class BanksExample extends BrowserLogin {
    double averagePurchase;
    double averageSele;

    double aPrb,aPrb2,aUkrSib,strAval12,strOB1;
    double bPrb,bPrb2,bUkrSib,strAval22,strOB2;
    double str;

    double x,x2,y,y2,z,z2;



    @Test(groups = "tD")
    public void prBank() {

        driver.get("https://www.privat24.ua");
        String usd = "USD:";
        String dol = "ДОЛ:";

        if (driver.findElement(By.xpath("//div[@class='container']/div[2]/span/strong[1]")).getText().equals(usd)){
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
            //System.out.println(bPrb);
        } else if (driver.findElement(By.xpath("//div[@class='section'][1]/div[1]")).getText().equals(dol)){
            WebElement element = driver.findElement(By.xpath("//div[@class='section'][1]/div[2]"));
            String str = element.getText();
            String substr = "/";
            String[] parts = str.split(substr);
            String before = parts[0];
            String after = parts[1];
            aPrb = Double.parseDouble(before);
            bPrb = Double.parseDouble(after);
        }

    }


    @Test(groups = "tD")
    public void ukrSib() {

            driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
            WebElement element1 = driver.findElement(By.xpath("//table[@class='currency__table']//tbody/tr[1]/td[2]"));
            String strUkrSib1 = element1.getText();
            WebElement element2 = driver.findElement(By.xpath("//table[@class='currency__table']//tbody/tr[1]/td[3]"));
            String strUkrSib2 = element2.getText();

            aUkrSib = Double.parseDouble(strUkrSib1);
            bUkrSib = Double.parseDouble(strUkrSib2);



    }

    @Test(groups = "tD")
        public void bankAval(){
            driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
            WebElement element1 = driver.findElement(By.xpath("//div[@class='body-currency-block-rba']//tbody/tr[2]/td[2]"));
            ///tring strAval1 = element1.getText();
            WebElement element2 = driver.findElement(By.xpath("//div[@class='body-currency-block-rba']//tbody/tr[2]/td[3]"));
            //String strAval2 = element2.getText();

            String strAval1 = element1.getText();
            strAval1 = strAval1.replace(',','.');
            String strAval2 = element2.getText();
            strAval2 = strAval2.replace(',','.');

            strAval12 = Double.parseDouble(strAval1);
            strAval22 = Double.parseDouble(strAval2);



    }
    @Test(groups = "tD")
    public void oschadBank(){
        driver.get("http://www.oschadbank.ua/ua/");
        WebElement element1 = driver.findElement(By.xpath("//strong[@class='buy-USD']"));
        WebElement element2 = driver.findElement(By.xpath("//strong[@class='sell-USD']"));

        String str1 = element1.getText();
        str1 = str1.replace(',','.');
        String str2 = element2.getText();
        str2 = str2.replace(',','.');

        strOB1 = Double.parseDouble(str1);
        strOB2 = Double.parseDouble(str2);




    }

    @Test(groups = "tD")
    public void nbuExample(){
        driver.get("https://bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        WebElement element = driver.findElement(By.xpath("//div[@class='content']/table[4]//tr[9]/td[5]"));

        str = Double.parseDouble(element.getText());
        str = str/100;



    }
   @AfterGroups (groups = "tD")
    public void BankEX2(){


        averagePurchase = (aPrb + aUkrSib + strAval12 + strOB1)/4;
        averageSele = (bPrb + bUkrSib + strAval22 + strOB2)/4;



       if (aPrb < aUkrSib){
           x = aPrb;
       }else {
           x = aUkrSib;
       }

       if (strAval12 < strOB1){
           y = strAval12;
       }else {
           y = strOB1;
       }

       if (x < y){
           z = x;
       }else {
           z = y;
       }


       if (bPrb > bUkrSib){
           x2 = bPrb;
       }else {
           x2 = bUkrSib;
       }

       if (strAval22 > strOB2){
           y2 = strAval22;
       }else {
           y2 = strOB2;
       }

       if (x2 > y2){
           z2 = x2;
       }else {
           z2 = y2;
       }

       if (z == aPrb) {
               System.out.println("Минимальное цена продажи Доллара в ПриватБанке: " + z);
           } else if (z == aUkrSib){
               System.out.println("Минимальное цена продажи Доллара в Укрсибе: " + z);
           } else if (z == strAval12){
               System.out.println("Минимальное цена продажи Доллара в Райфайзен: " + z);
           } else {
               System.out.println("Минимальное цена продажи Доллара в ОщадБанке: " + z);
           }

           if (z2 == bPrb) {
               System.out.println("Максимальное цена покупки Доллара в ПриватБанке: " + z2);
           } else if (z2 == bUkrSib){
               System.out.println("Максимальное цена покупки Доллара в Укрсибе: " + z2);
           } else if (z2 == strAval22){
               System.out.println("Максимальное цена покупки Доллара в Райфайзен: " + z2);
           } else {
               System.out.println("Максимальное цена покупки Доллара в ОщадБанке: " + z2);
           }

       //       Double[] doubleArr1 = {aPrb,aUkrSib,strAval12,strOB1};
//       double minArr1 = doubleArr1[0];
//       for(Double value1 : doubleArr1) {
//           if (value1 < minArr1) {
//               minArr1 = value1;
//           }
//       }
//
//       Double[] doubleArr2 = {bPrb,bUkrSib,strAval22,strOB2};
//       double maxArr2 = doubleArr2[0];
//       for(Double value2 : doubleArr2) {
//           if (value2 > maxArr2) {
//               maxArr2 = value2;
//           }
//       }

//           if (minArr1 == aPrb) {
//               System.out.println("Минимальное цена продажи Доллара в ПриватБанке: " + minArr1);
//           } else if (minArr1 == aUkrSib){
//               System.out.println("Минимальное цена продажи Доллара в Укрсибе: " + minArr1);
//           } else if (minArr1 == strAval12){
//               System.out.println("Минимальное цена продажи Доллара в Райфайзен: " + minArr1);
//           } else {
//               System.out.println("Минимальное цена продажи Доллара в ОщадБанке: " + minArr1);
//           }
//           if (maxArr2 == bPrb) {
//               System.out.println("Максимальное цена покупки Доллара в ПриватБанке: " + maxArr2);
//           } else if (maxArr2 == bUkrSib){
//               System.out.println("Максимальное цена покупки Доллара в Укрсибе: " + maxArr2);
//           } else if (maxArr2 == strAval22){
//               System.out.println("Максимальное цена покупки Доллара в Райфайзен: " + maxArr2);
//           } else {
//               System.out.println("Максимальное цена покупки Доллара в ОщадБанке: " + maxArr2);
//           }

        System.out.println("Курс НБУ: " + str);
        System.out.println("Среднее покупка по банкам: " + averagePurchase);
        System.out.println("Среднее продажа по банкам: " + averageSele);

   }
}
