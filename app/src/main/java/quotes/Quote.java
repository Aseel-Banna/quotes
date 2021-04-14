package quotes;

import java.util.ArrayList;
import java.util.Objects;

public class Quote {
    String author;
    String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quotes = (Quote) o;
        return author.equals(quotes.author) && text.equals(quotes.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text);
    }
}
