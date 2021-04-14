package quotes;

import java.util.Random;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class QuoteReader {
    public Quote[] quotes;

    public QuoteReader (String theFile) throws FileNotFoundException {
        this.quotes = readQuotes(theFile);
    }

    public Quote[] readQuotes(String theFile) throws FileNotFoundException{
        Gson gson = new Gson();
        Reader reader = new FileReader(theFile);
        quotes = gson.fromJson(reader, Quote[].class);
        return quotes;
    }

    public String getRandomQuote(){
        int index = new Random().nextInt(quotes.length);
        StringBuilder result = new StringBuilder();
        result.append(quotes[index].getText());
        result.append("\n- Author: " + quotes[index].getAuthor());

        return result.toString();
    }


}