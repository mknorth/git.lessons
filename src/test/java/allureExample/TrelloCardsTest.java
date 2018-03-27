package allureExample;

import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static lesson7part2.BrowserFactory.driver;

@Epic("API")
public class TrelloCardsTest {


        @Test
        @Parameters({"name"})
        @Feature("Cards Actions")
        @Story("Create new card with name")
        public void createNewCard() {
                System.out.println("All is ok");
        }

        @Attachment(value = "Page screenshot", type = "image/png")
        public byte[] saveScreenshot() {
                return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }

}


