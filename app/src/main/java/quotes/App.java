package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;

public class App {

    public static void main(String[] args) throws IOException {
        getUrlQuote("https://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote");
    }

    public static void getFileQuote() throws IOException {
        String allQuotes = read("../app/src/main/resources/recentquotes.json");
        Gson gson = new Gson();
        Quote[] quotes = gson.fromJson(allQuotes, Quote[].class );
        int random = (int)(Math.random() * quotes.length);
        System.out.println(quotes[random]);
    }

    public static void getUrlQuote(String quoteUrl) throws IOException {
        try {
            URL url = new URL(quoteUrl);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));

            Gson gson = new Gson();
            ApiQuote randomQuote = gson.fromJson(reader, ApiQuote.class);
            System.out.println(randomQuote.getContent());
            write(randomQuote);

        } catch (MalformedURLException e) {
            System.out.println("exception: " + e);
            getFileQuote();
        }
    }

    public static String read(String fileName) throws IOException {
        Scanner sc = new Scanner(new File(fileName));
        StringBuilder strings = new StringBuilder();
        while(sc.hasNextLine()){
            strings.append(sc.nextLine());
        }
        return strings.toString();
    }

    public  static void write(ApiQuote t) throws IOException {
        Gson gson = new Gson();
        String gsonParsing = gson.toJson(t);

        BufferedWriter writer = new BufferedWriter(new FileWriter("../app/src/main/resources/test.json", true));
        writer.newLine();
        writer.write(gsonParsing);
        writer.close();
    }

}
