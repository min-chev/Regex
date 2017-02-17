import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2}) (?:AM|PM)$");


        while (true) {
            if (text.equals("END")) {
                break;
            }
            Matcher matcher = pattern1.matcher(text);
            if (matcher.find()) {
                if (isValidTime(matcher)) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            } else {
                System.out.println("invalid");
            }
            text = scanner.nextLine();
        }

    }

    private static boolean isValidTime(Matcher matcher) {

        int hours = Integer.parseInt(matcher.group(1));
        int mins = Integer.parseInt(matcher.group(2));
        int secs = Integer.parseInt(matcher.group(3));

        if(!(1 <= hours && hours <=12)){
            return false;
        }if(!(0 <= mins && mins <=59)){
            return false;
        }if(!(0 <= secs && secs <=59)){
            return false;
        }

        return true;
    }
}
