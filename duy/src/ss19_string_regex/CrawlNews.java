package ss19_string_regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) throws IOException {
        URL link = new URL("https://dantri.com.vn/the-gioi.htm");
        URLConnection connection = link.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder dataLine = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            dataLine.append(line);
        }
        // Xử lý HTML tag h1 - h6
        String regex = "<h[1-6][^>]*><a[^>]*>(.*?)</a></h[1-6]>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dataLine.toString());
        while (matcher.find()) {
            String title = matcher.group(1).replaceAll("\\&quot", "\"").trim();
            System.out.println(title);
        }
        reader.close();
    }
}
