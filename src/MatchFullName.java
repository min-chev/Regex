import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");

        while (true){
            if(inp.equals("end")){
                break;
            }

            Matcher matcher = pattern.matcher(inp);

            if(matcher.find()){
                System.out.println(inp);
            }

            inp = scanner.nextLine();
        }

    }
}
