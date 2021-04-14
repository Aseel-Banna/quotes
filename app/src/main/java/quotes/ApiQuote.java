package quotes;

public class ApiQuote {
    public String content;

    public ApiQuote(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }
    //    @Override
    public String toString() {
        return String.format("Content: ", this.content);
    }

}
