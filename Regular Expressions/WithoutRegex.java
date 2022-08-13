import java.util.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WithoutRegex {
    public static void main(String[] args)
    throws MalformedURLException{
        Scanner s = new Scanner(System.in);
        String url = s.nextLine();
        while (!url.equals("quit")) {
            System.out.println(getInfo(url));
            url = s.nextLine();
        }
    }

    public static String getInfo(String url)
    throws MalformedURLException{
       URL u=new URL(url);
       return "\nProtocol Name: "+u.getProtocol()+"\nHostname: "+u.getHost()+"\nDefault Port: "+u.getDefaultPort()
               +"\nQuery: "+u.getQuery()+"\nPath: "+u.getPath()+"\nFile: "+u.getFile()+"\nReference: "+ u.getRef();
    }
}
