import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexq {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String url=s.nextLine();
        while(!url.equals("quit")){
            System.out.println(getInfo(url));
            url=s.nextLine();
        }
    }
    public static String getInfo(String url){
        Pattern p=Pattern.compile(".*://");
        Matcher match=p.matcher(url);
        String Info=new String();
        if(match.find()) {
            Info+="\nPrtocol Name: " + match.group().replace("://","");
        }
        p=Pattern.compile("://[0-9a-zA-Z_.-]*");
        match=p.matcher(url);
        String str=new String();
        if(match.find()) {
            str=match.group();
            Info+="\nHostname: "+ match.group().replaceAll("(://)*(:[0-9]/)*","");
        }
        p=Pattern.compile("://.*\\?");
        match=p.matcher(url);
        if(match.find()) {
            str=match.group().replace(str,"");
            Info+="\npathstring: "+ str.replaceAll("(:[0-9]*/)*\\?","");
        }

        return Info;
    }
}
