import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("<.*?>");


        while (true){
            if(text.equals("END")){
                break;
            }
            Matcher matcher = pattern1.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
            text = scanner.nextLine();
        }

    }
}
