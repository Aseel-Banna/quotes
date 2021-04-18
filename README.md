# quotes

I used the file [recentquotes.json](https://github.com/Aseel-Banna/quotes/blob/main/app/src/main/resources/recentquotes.json) to show random popular book quotes. 
In the app,  I used GSON to parse the .json file, and there is no functionality other than showing the quote and the author when it is run, even there are more data inside the file. The app is choosing one quote each time it is run.


## Lab 09: Web requests
In this lab, we should use an url api to get quotes.

HOW THE APP WORK?
***getUrlQuote(String quoteUrl)***: this method was created to create a connection between the client and server. It takes an url as a parameter and make the connection by calling other methods, such as:
- **getBufferedReader(HttpURLConnection connection)**: it is used to create Input stream.
- **getContent(BufferedReader reader)**: it is used to read the content of the reader file.
- ***write(ApiQuote t)***: it is used to write the quote that came from API inside the local JSON file.
- ***getFileQuote()***: it is used to read the quotes locally.

In the main method, I called getUrlQuote method and send the url of the API, which is [](http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en).
