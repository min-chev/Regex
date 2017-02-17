import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("^[\\w-]{3,16}$");

        while (true){
            if(text.equals("END")){
                break;
            }
            Matcher matcher = pattern1.matcher(text);
            if (matcher.find()) {
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
            text = scanner.nextLine();
        }
    }
}
