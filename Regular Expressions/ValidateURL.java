import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateURL {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String url=s.nextLine();
        while(!url.equals("quit")){
            System.out.println(isURLValid(url));
            url=s.nextLine();
        }
    }
    public static boolean isURLValid(String url){
        Pattern p=Pattern.compile("http(s?)://(www/.)?.*");
        Matcher match=p.matcher(url);
        return match.matches();
    }
}
