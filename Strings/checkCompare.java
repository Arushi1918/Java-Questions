import java.util.*;
public class checkCompare {
    public static void main(String[] args){
        String s3="Hello";
        String s4=new String("Hello");
        String s5="Hello", s1="Hello123", s2="Bingo";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));

        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s5));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s5));
    }
}
