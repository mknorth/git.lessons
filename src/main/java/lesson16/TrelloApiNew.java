package lesson16;

import okhttp3.*;

import java.io.IOException;

public class TrelloApiNew {
    public static final String KEY = "881322fbe4efc4ec1caf445e50613e69";

    public static final String TOKEN = "dcc9a097eff0b8f27865acdc7aed131953a82fbf7d22b4de814aaf17e005344f";

    OkHttpClient client = new OkHttpClient();

    public String post(String url, String json) throws IOException {


        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    public String getBoardList(String bordId) throws IOException {
        String url = "https://api.trello.com/1/boards/"+bordId+"/lists?cards=all&key"+KEY+"&token"+TOKEN;
        String response = get(url);
        return response;
    }
    public String getLableList(String bordId) throws IOException {
        String url = "https://api.trello.com/1/boards/"+bordId+"/labels?cards=all&key="+KEY+"&token="+TOKEN;
        String response = get(url);
        return response;
    }
}
