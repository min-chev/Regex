import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("[^.!?]*\\b"+word+"\\b[^.!?]*[.!?]");

        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            System.out.println(matcher.group().trim());
        }


    }
}
