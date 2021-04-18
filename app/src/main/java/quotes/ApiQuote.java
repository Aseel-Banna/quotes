package quotes;

public class ApiQuote {
    String quoteText;
    String quoteAuthor;

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    @Override
    public String toString() {
        return "ApiQuote{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                '}';
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }
}
