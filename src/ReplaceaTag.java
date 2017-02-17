import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceaTag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        StringBuilder sb = new StringBuilder("");

        while (true) {
            if(input.equals("END")){
                break;
            }
            sb.append(input).append("\r\n");

            input = reader.readLine();
        }

        Pattern htmlPattern = Pattern.compile("<a\\s+(href=[^>]+)>([^<]+)<\\/a>");
        Matcher htmlMatcher = htmlPattern.matcher(sb);

        while (htmlMatcher.find()){
            int startpos= htmlMatcher.start();
            int endpos= htmlMatcher.end();

            String replacement= "[URL " + htmlMatcher.group(1) + "]" + htmlMatcher.group(2) + "[/URL]";
            sb.replace(startpos, endpos, replacement);

            htmlMatcher = htmlPattern.matcher(sb);
        }

        System.out.println(sb);

    }
}
