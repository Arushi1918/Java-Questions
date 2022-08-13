import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeComment {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        while(!string.equals("quit")){
            System.out.println(newString(string));
            string=s.nextLine();
        }
    }
    public static String newString(String string){
        return string.replaceAll("<!--.*-->"," ");
    }
    }

