import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern1.matcher(text);


        int counter = 0;

        while (matcher.find()) {
            counter++;
        }

        System.out.println("Vowels: "+ counter);

    }
}
