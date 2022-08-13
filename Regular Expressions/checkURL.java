import java.util.*;
public class checkURL {
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
        int count = 0;
        if(ip==null)
            return false;

        for (int i = 0; i < ip.length(); i++) {
            if (ip.charAt(i) == '.')
                count++;}
            if (count != 3)
                return false;
            StringTokenizer st = new StringTokenizer(ip, ".");
            int places=0;
            while(st.hasMoreTokens()){
                places++;
                String token=st.nextToken();
                if(token.equals("0"))
                    continue;

                if(token.length()>0 && token.startsWith("0"))
                    return false;

                for(int j=0; j< token.length();j++){
                    char t=token.charAt(j);

                   if(t>'9'||t<'0')
                       return false;

                }
                int curr;
                try{
                    curr=Integer.parseInt(token);
                }
                catch(Exception e){
                    return false;
                }
                if(curr<0 || curr>255)
                    return false;

            }
            if(places!=4)
                return false;

            return true;
        }

        public static boolean checkIPv6(String ip){
            int count = 0;
            if(ip==null)
                return false;

            for (int i = 0; i < ip.length(); i++) {
                if (ip.charAt(i) == ':')
                    count++;}
            if (count!= 7)
                return false;
            StringTokenizer st = new StringTokenizer(ip, ":");
            int places=0;
            while(st.hasMoreTokens()){
                places++;
                String token=st.nextToken();

                if(token.length()<1 || token.length()>4)
                    return false;

                for(int j=0; j< token.length();j++){
                    char t=token.charAt(j);

                    if((t>'9'|| t<'0')&&(t<'a'|| t>'f')&&(t<'A'|| t>'F'))
                        return false;

                }
                if(token.equals("0"))
                    continue;

            }
            if(places!=8)
                return false;

            return true;
        }
    }

