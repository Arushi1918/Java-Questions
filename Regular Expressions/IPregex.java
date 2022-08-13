import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPregex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ip = s.nextLine();
        while (!ip.equals("quit")) {
            System.out.println(checkIP(ip));
            ip = s.nextLine();
        }
    }

    public static String checkIP(String ip) {
        if (checkIPv4(ip))
            return "IPv4";
        else if(checkIPv6(ip))
            return "IPv6";
        else
            return "Invalid";
    }

    public static boolean checkIPv4(String ip) {

        if(ip==null)
            return false;
        Pattern p=Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher match=p.matcher(ip);
        if(!match.matches())
            return false;

        String[] tokens = ip.split("\\.");

            try{
                for(String token:tokens) {
                    if(Integer.parseInt(token)>255 || (token.length()>1 && token.startsWith("0")))
                        return false;
                }
            }
            catch(Exception e){
                return false;
            }

        return true;
    }

    public static boolean checkIPv6(String ip){
        if(ip==null)
            return false;

        Pattern p=Pattern.compile("^([0-9a-fA-F]{1,4}):([0-9a-fA-F]{1,4}):([0-9a-fA-F]{1,4}):([0-9a-fA-F]{1,4}):" +
                "([0-9a-fA-F]{1,4}):([0-9a-fA-F]{1,4}):([0-9a-fA-F]{1,4}):([0-9a-fA-F]{1,4})$");
        Matcher match=p.matcher(ip);
        if(!match.matches())
            return false;

        return true;
    }
}

