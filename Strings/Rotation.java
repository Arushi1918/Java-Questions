import java.util.*;
public class Rotation {
    public static void main(String[] args){
        System.out.print("Enter 2 Strings: ");
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        if(str1.length()!=str2.length())
            System.out.println("String2 is not the rotated version of string2.");
        else{
            String str3=str1+str1;
            if (str3.contains(str2)) {
                System.out.println("string2 is rotated version of string1");
            }
            else{
                System.out.println("String2 is not rotated version of string1");
            }
        }
    }
}
