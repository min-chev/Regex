import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = scanner.nextLine();
        String matcherString = scanner.nextLine();

        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(matcherString);

        int counter = 0;

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);
    }
}
