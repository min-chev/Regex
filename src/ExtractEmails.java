import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("( |^)([a-z](?:_?[\\w\\-\\.]+@[\\w-]+\\.[a-z]+(\\.[a-z]+)?))(?:|,|\\.| |$)");

        while (true) {
            if (line.equals("end")) {
                break;
            }

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(0));
            }

            line = scanner.nextLine();
        }

    }
}
