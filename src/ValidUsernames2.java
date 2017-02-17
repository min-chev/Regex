import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String names = reader.readLine();

        Pattern pattern = Pattern.compile("(?<=[ \\/\\\\()]|^)[a-zA-Z]\\w{2,24}(?=[ \\/\\\\()]|$)");

        Matcher matcher = pattern.matcher(names);

        List<String> usernames = new ArrayList<>();
        while (matcher.find()){
            usernames.add(matcher.group());
        }

        List<String> outputList = new ArrayList<>();
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < usernames.size()-1; i++) {
            int tempsum = usernames.get(i).length()+usernames.get(i+1).length();
            if(tempsum>maxsum){
                outputList.clear();
                outputList.add(usernames.get(i));
                outputList.add(usernames.get(i+1));
                maxsum=tempsum;
            }else if(tempsum==maxsum&&!outputList.contains(usernames.get(i))){
                outputList.add(usernames.get(i));
                outputList.add(usernames.get(i+1));
                maxsum=tempsum;
            }
        }

        for (String s : outputList) {
            System.out.println(s);
        }
    }
}

