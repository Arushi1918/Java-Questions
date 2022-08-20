import java.util.*;
public class DeleteDuplicateCharacter {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string1 and string2");
        String s1=s.nextLine();
        String s2=s.nextLine();
        String s3="";

        int i=0;
        if(s1.length()<=s2.length()){
            s1=s1+s2;
            s2=s1.substring(0,s1.length()-s2.length());
            s1=s1.substring(s2.length());
        }

        while(i<s1.length()){
            char c =s1.charAt(i);
            if(s2.indexOf(c)==-1)
                s3+=c;
            i++;
        }
        System.out.println(s3);
    }
}
