import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        StringBuilder sb = new StringBuilder();

        while (true) {
            if (input.equals("END")) {
                break;
            }
            sb.append(input);

            input = reader.readLine();
        }

        Pattern pattern = Pattern.compile("([A-Z][a-zA-Z]*)[^a-zA-Z+]*?(\\+*\\d[\\d()\\/\\.\\- ]*\\d)");

        Matcher matcher = pattern.matcher(sb);

        StringBuilder sb2 = new StringBuilder();

        int counter = 1;
        while (matcher.find()) {
            if (counter == 1) {
                sb2.append("<ol>");
                counter--;
            }
            String number = matcher.group(2).replaceAll("[^0-9+]", "");
            sb2.append(MessageFormat.format("<li><b>{0}:</b> {1}</li>", matcher.group(1), number));
        }

        if (sb2.length()==0) {
            System.out.println("<p>No matches!</p>");
        } else {
            sb2.append("</ol>");
            System.out.println(sb2);
        }


    }
}
//(\b[A-Z][a-zA-Z]*)[^a-zA-Z0-9]*?([0-9+][0-9+()\/\.\- ]*[0-9]\b)
//([A-Z][a-zA-Z]*)[^a-zA-Z+]*?(\+*\d[\d().\/\- ]*\d)