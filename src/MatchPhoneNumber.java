import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine();

        Pattern pattern = Pattern.compile("^\\+359([ -])2\\1[\\d]{3}\\1[\\d]{4}$");

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
