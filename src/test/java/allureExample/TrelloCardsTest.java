package allureExample;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Epic("API")
public class TrelloCardsTest {


        @Test
        @Parameters({"name"})
        @Feature("Cards Actions")
        @Story("Create new card with name")
        public void createNewCard(){

        }
    }



