package homework8;

import homework3.BrowserLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class PrBankExample3 extends BrowserLogin {
    double aPrb, aUkrSib, strAval12, strOB1;
    double bPrb, bUkrSib, strAval22, strOB2;

    double x,y,z,x2,y2,z2;
    double averagePurchase,averageSele;

    @Test(/*groups = "rr"*/)
    public void prBank() {

        driver.get("https://www.privat24.ua");
        String pageSource = driver.getPageSource();
        String startUSDBuy = "section-content rate\">";
        String endUSDBuy = "/";
        String endUSDSel = "</div>";

        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String cs = pageSource.substring(0, pageSource.indexOf(endUSDBuy) - 1).trim();
        aPrb = Double.parseDouble(cs);
        String cs2 = pageSource.substring(pageSource.indexOf(endUSDBuy) + 2, pageSource.indexOf(endUSDSel)).trim();
        bPrb = Double.parseDouble(cs2);

        }


    @Test(/*groups = "rr"*/)
    public void ukrSib() {

        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String pageSource = driver.getPageSource();
        String startUSDBuy = "mobile-curr-name\">Покупка</span>";
        String endUSDBuy = "<i";
        String startUSDSel = "mobile-curr-name\">Продажа</span>";
        String endUSDSel = "<i";

        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String cs = pageSource.substring(0, pageSource.indexOf(endUSDBuy)).trim();
        aUkrSib = Double.parseDouble(cs);

        pageSource = pageSource.substring(pageSource.indexOf(startUSDSel) + startUSDSel.length());
        String cs2 = pageSource.substring(0, pageSource.indexOf(endUSDSel)).trim();
        bUkrSib = Double.parseDouble(cs2);
    }

    @Test(/*groups = "rr"*/)
    public void bankAval(){

        driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
        String pageSource = driver.getPageSource();
        String startUSDBuy = "class=\"right\">";
        String endUSDBuy = "</td>";
        String startUSDSel = "</td><td class=\"right\">";
        String endUSDSel = "</td>";

        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String cs = pageSource.substring(0, pageSource.indexOf(endUSDBuy)).trim();
        String strAval1 = cs.replace(',','.');
        strAval12 = Double.parseDouble(strAval1);

        pageSource = pageSource.substring(pageSource.indexOf(endUSDSel) + startUSDSel.length());
        String cs2 = pageSource.substring(0, pageSource.indexOf(endUSDSel)).trim();
        String strAval2 = cs2.replace(',','.');
        strAval22 = Double.parseDouble(strAval2);
    }

    @Test(/*groups = "rr"*/)
    public void oschadBank() {
        driver.get("http://www.oschadbank.ua/ua/");
        String pageSource = driver.getPageSource();
        String startUSDBuy = "buy-USD\" data-buy=\"";
        String endUSDBuy = "\">";
        String startUSDSel = "sell-USD\" data-sell=\"";
        String endUSDSel = "\">";

        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String cs =  pageSource.substring(0, pageSource.indexOf(endUSDBuy));
        String str1 = cs.replace(',','.');
        strOB1 = Double.parseDouble(str1);

        pageSource = pageSource.substring(pageSource.indexOf(startUSDSel) + startUSDSel.length());
        String cs2 =  pageSource.substring(0, pageSource.indexOf(endUSDSel));
        String str2 = cs2.replace(',','.');
        strOB2 = Double.parseDouble(str2);
    }


    //@AfterGroups(/*groups = "rr"*/)
    @Test
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

        System.out.println("Среднее покупка по банкам: " + averagePurchase);
        System.out.println("Среднее продажа по банкам: " + averageSele);

    }
}

