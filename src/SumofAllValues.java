import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumofAllValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();

        String text = reader.readLine();

        Pattern pattern1 = Pattern.compile("^([a-zA-Z_]+(?=\\d)).*?((?<=\\d)[a-zA-Z_]+)$");
        Matcher matcher = pattern1.matcher(key);

        if (matcher.find()) {
            String keyStart = matcher.group(1);
            String keyEnd = matcher.group(2);

            Pattern pattern2 = Pattern.compile(keyStart + "([\\d.]+?)" + keyEnd);
            Matcher matcher2 = pattern2.matcher(text);

            Double values = 0.0;
            while (matcher2.find()) {
               try{
                   values += Double.parseDouble(matcher2.group(1));
               }
                catch (Exception e) {}
            }
            String value = "";
            if(values!=0){
                value =  new DecimalFormat("#.##").format(values);
            }else{
                 value = "nothing";
            }
                System.out.printf("<p>The total value is: <em>%s</em></p>", value);

        } else {
            System.out.println("<p>A key is missing</p>");
        }

    }
}



