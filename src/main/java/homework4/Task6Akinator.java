package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.security.Key;
import java.util.Scanner;

public class Task6Akinator {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        WebDriver driver = new ChromeDriver();
        driver.get("http://ru.akinator.com/");
        driver.findElement(By.cssSelector(".rouge")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#elokence_sitebundle_identification_age")).clear();
        driver.findElement(By.cssSelector("#elokence_sitebundle_identification_age")).sendKeys("28");
        driver.findElement(By.cssSelector("#elokence_sitebundle_identification_age")).sendKeys(Keys.ENTER);
//        driver.findElement(By.cssSelector("#infos-area-footer>[type=submit]")).click();
//        System.out.println("1 - Да");
//        System.out.println("2 - Нет");
//        System.out.println("3 - Я не знаю");
//        System.out.println("4 - Возможно");
//        System.out.println("5 - Скорее нет");

//        WebElement element2 = driver.findElement(By.cssSelector("#bulle-outer>#bulle-inner"));
//        System.out.println(element2.getText());
//        WebElement element3 = driver.findElement(By.cssSelector("#content>#bulle-outer>#bulle-inner"));
//        element3.getText();
//        WebElement element4 = driver.findElement(By.cssSelector("#questionNo"));
//        element4.getText();



        do {
            Thread.sleep(2000);
            System.out.println("Вопрос № " + driver.findElement(By.cssSelector("#questionNo>#nqp")).getText());
            System.out.println(driver.findElement(By.cssSelector("#content>#bulle-outer>#bulle-inner")).getText());
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            System.out.println("3 - Я не знаю");
            System.out.println("4 - Возможно");
            System.out.println("5 - Скорее нет");

            int sc = scanner.nextInt();
//            switch (sc){
//                case 1:
//                    WebElement element = driver.findElement(By.cssSelector(".reponse>#reponse1"));
//                    element.click();
////                    WebElement element32 = driver.findElement(By.cssSelector("#bulle-outer>#bulle-inner"));
////                    System.out.println(element3.getText());
////                    System.out.println(element2.getText());
//                    break;
//                case 2:
//                    WebElement element21 = driver.findElement(By.cssSelector(".reponse>#reponse1"));
//                    element21.click();
////                    System.out.println(element2.getText());
//                    break;
//                case 3:
//                    WebElement element31 = driver.findElement(By.cssSelector(".reponse>#reponse1"));
//                    element31.click();
////                    System.out.println(element2.getText());
//                    break;
//                case 4:
//                    WebElement element4 = driver.findElement(By.cssSelector(".reponse>#reponse1"));
//                    element4.click();
////                    System.out.println(element2.getText());
//                    break;
//                case 5:
//                    WebElement element5 = driver.findElement(By.cssSelector(".reponse>#reponse1"));
//                    element5.click();
////                    System.out.println(element2.getText());
//                    break;
//            default:
//                System.out.println("число не равно 1, 8, 9");
//            }

            if (sc == 1) {
                WebElement element = driver.findElement(By.cssSelector(".reponse>#reponse1"));
                element.click();
            } else if (sc == 2) {
                WebElement element = driver.findElement(By.cssSelector(".reponse>#reponse2"));
                element.click();
            } else if (sc == 3) {
                WebElement element = driver.findElement(By.cssSelector(".reponse>#reponse3"));
                element.click();
            } else if (sc == 4) {
                WebElement element = driver.findElement(By.cssSelector(".reponse>#reponse4"));
                element.click();
            } else if (sc == 5){
                WebElement element = driver.findElement(By.cssSelector(".reponse>#reponse5"));
                element.click();
            }
//            else {
//                System.out.println("There is no such ansver...");
//            }
            Thread.sleep(2000);
        }while(driver.getCurrentUrl().equals("http://ru.akinator.com/personnages/jeu"));
        Thread.sleep(3000);

        System.out.println("Я думаю это: " + driver.findElement(By.cssSelector("#infos-perso-title>#perso")).getText());


//        driver.quit();
    }
}
