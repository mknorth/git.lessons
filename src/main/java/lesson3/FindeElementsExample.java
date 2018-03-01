package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class FindeElementsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/chart/top");
        //WebElement element = driver.findElement(By.xpath("//tbody[@class='lister-list']/tr[2]"));
        List<WebElement> elements = driver.findElements(By.cssSelector(".lister-list tr"));


        for (WebElement element : elements)
            System.out.println(element.getText());
            System.out.println(elements.size()); // если таблица будет пустая то size() поможет определить это он выведет 0!!!
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        driver.quit();
        }
    }

