package lesson12abs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class qweqwrqw {
    public static void main(String[] args) {


//        final String d = "df";
//        double f = Double.parseDouble(d);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".someSelector")));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        System.out.println(String.);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.privat24.ua");
        driver.findElement(By.cssSelector("[class='section-content type']")).sendKeys();
        String a = "ДОЛ:";
        String f = driver.findElement(By.cssSelector("[class='section-content type']")).getText();

        if (f.trim().equals(a)){
            System.out.println("TRUE");
        }
        driver.quit();
    }
    @DataProvider(name="email")
    public static Object[][] email() {
        return new Object[][] {
                { "bla@mail.com" },
                { "blabla@mail.com" },

        };
    }




}
