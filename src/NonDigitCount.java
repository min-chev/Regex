import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonDigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("[^0123456789]");
        Matcher matcher = pattern1.matcher(text);

        int counter = 0;

        while (matcher.find())
        {
            counter++;
        }

        System.out.println("Non-digits: " + counter);

    }
}
