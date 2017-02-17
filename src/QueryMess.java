import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryMess {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("([^?&]+?)=([^?]+?(?=&|$))");

        String line = reader.readLine();
        while (true){
            if(line.equals("END")){
                break;
            }
            Map<String, List<String>> fieldAndValues = new LinkedHashMap<>();
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){
                String field = String.join(" ",matcher.group(1).split("%20|\\+")).trim();
                String[] values = matcher.group(2).split("%20|\\+");

                List<String> valuesList = new ArrayList<>();

                for (String value : values) {
                    if (!value.equals("")) {
                        valuesList.add(value);
                    }
                }

                String value = String.join(" ", valuesList).trim();

                if (!fieldAndValues.containsKey(field)) {
                    fieldAndValues.put(field, new ArrayList<>());
                }
                fieldAndValues.get(field).add(value);
            }

            for (String s : fieldAndValues.keySet()) {
                System.out.printf("%s=[%s]", s, String.join(", ", fieldAndValues.get(s)));
            }
            System.out.println();

            line = reader.readLine();
        }





    }
}
