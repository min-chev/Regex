import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntegerNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher = pattern1.matcher(text);


        while (matcher.find()) {
            System.out.println(matcher.group());

        }

    }
}
