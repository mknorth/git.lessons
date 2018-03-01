package lesson16;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestTrelloApi {

    @Test
    public void testGetBoardList() throws IOException{
        TrelloApiNew trelloApiNew = new TrelloApiNew();
        String boardList = trelloApiNew.getBoardList("WBIXwmBR");
        System.out.println(boardList);
    }
    @Test
    public void testGetLableList() throws IOException{
        TrelloApiNew trelloApiNew = new TrelloApiNew();
        String boardList = trelloApiNew.getLableList("WBIXwmBR");
        System.out.println(boardList);
    }
}
